// ======================================================================
// \title  IntrepidDebugTopology.cpp
// \brief cpp file containing the topology instantiation code
//
// ======================================================================
// Provides access to autocoded functions
#include <IntrepidPrime/Deployments/IntrepidDebug/Top/IntrepidDebugTopologyAc.hpp>
#include <IntrepidPrime/Deployments/IntrepidDebug/Top/IntrepidDebugTopology.hpp>
// Note: Uncomment when using Svc:TlmPacketizer
//#include <IntrepidPrime/Deployments/IntrepidDebug/Top/IntrepidDebugPacketsAc.hpp>

//! DMA RX buffer, 2 halfs for ping-pong operation
alignas(4) static U8 s_dma_rx_buffer1[Va416x0Drv::UartDriver::DMA_RX_BUFFER_SIZE];
// Public functions for use in main program are namespaced with deployment module IntrepidPrime
// This is also the namespace where the topology components are instantiated by FPP.
namespace IntrepidPrime {
using namespace IntrepidConfig;

// The reference topology divides the incoming clock signal into sub-signals
Svc::RateGroupDriver::DividerSet rateGroupDivisorsSet{{{RG_DIV_1, RG_DIV_DEF_OFFSET}, {RG_DIV_2, RG_DIV_DEF_OFFSET}, {RG_DIV_3, RG_DIV_DEF_OFFSET}}};

// Rate groups may supply a context token to each of the attached children whose purpose is set by the project. The
// reference topology sets each token to zero as these contexts are unused in this project.
U32 rateGroup1Context[FppConstant_PassiveRateGroupOutputPorts::PassiveRateGroupOutputPorts] = {};
U32 rateGroup2Context[FppConstant_PassiveRateGroupOutputPorts::PassiveRateGroupOutputPorts] = {};
U32 rateGroup3Context[FppConstant_PassiveRateGroupOutputPorts::PassiveRateGroupOutputPorts] = {};

static CandoSvc::CanMailbox::CDSP_DADR s_canFilterList[] = {CandoSvc::CAN_ADDR_CPN};
static CandoSvc::CanMailbox::MailboxOutConfig s_canMbOut[] = {
    {0x0, CandoSvc::CAN_ADDR_CPN, CandoSvc::CAN_ADDR_RDC_2},
    {0x1, CandoSvc::CAN_ADDR_CPN, CandoSvc::CAN_ADDR_RDC_3},
    {0x0, CandoSvc::CAN_ADDR_CPN, CandoSvc::CAN_ADDR_RDC_MC, true /*Multicast out*/}};
static CandoSvc::CanMailbox::CDSP_SADR s_canSenderFilterList[] = {CandoSvc::CAN_ADDR_RDC_2, CandoSvc::CAN_ADDR_RDC_3};

/**
 * \brief configure/setup components in project-specific way
 *
 * This is a *helper* function which configures/sets up each component requiring project specific input. This includes
 * allocating resources, passing-in arguments, etc. This function may be inlined into the topology setup function if
 * desired, but is extracted here for clarity.
 */
void configureTopology(const TopologyState& state) {
    // Rate group driver needs a divisor list
    rateGroupDriver.configure(rateGroupDivisorsSet);

    // Rate groups require context arrays.
    rateGroup1.configure(rateGroup1Context, FW_NUM_ARRAY_ELEMENTS(rateGroup1Context));
    rateGroup2.configure(rateGroup2Context, FW_NUM_ARRAY_ELEMENTS(rateGroup2Context));

    // Configure UART driver
    comDriver.open(Va416x0Drv::UartDriver::getUartDevice(state.uartNumber),
               static_cast<Va416x0Drv::UartDriver::UartBaudRate>(state.baudRate),
               Va416x0Mmio::Gpio::PORTG[1],  // RX
               Va416x0Mmio::Gpio::PORTG[0],  // TX
               s_dma_rx_buffer1, UART_DMA_CH);
    
    // Configure GPIO for LED blinking
    gpioDriver.open(Va416x0Drv::GpioDriver::GpioPort::PORT_G, LED_PIN, Fw::Direction::OUT);

    // Configure CAN Controller and CAN Mailbox
    canMailbox.setup(s_canFilterList, FW_NUM_ARRAY_ELEMENTS(s_canFilterList),
                    s_canMbOut, FW_NUM_ARRAY_ELEMENTS(s_canMbOut),
                    s_canSenderFilterList, FW_NUM_ARRAY_ELEMENTS(s_canSenderFilterList));
    canDriver.open(Va416x0Mmio::CAN0, Va416x0Drv::CanDriver::BAUD_500K, Va416x0Drv::CanDriver::DIAGNOSTIC, true, 64);
}

void setupComponents() {
    cmdDisp.setup(10, mallocator);
    tlmSend.setup(12, mallocator);
}

void setupTopology(const TopologyState& state) {
    // Memory allocation before init
    setupComponents();
    // Autocoded initialization. Function provided by autocoder.
    initComponents(state);
    // Autocoded id setup. Function provided by autocoder.
    setBaseIds();
    // Autocoded connection wiring. Function provided by autocoder.
    connectComponents();
    // Autocoded command registration. Function provided by autocoder.
    regCommands();
    // Autocoded configuration. Function provided by autocoder.
    configComponents(state);
    // Project-specific component configuration. Function provided above. May be inlined, if desired.
    configureTopology(state);
    // Autocoded parameter loading. Function provided by autocoder.
    // This function is disabled for baremetal deployments without file systems.
    //loadParameters();
    // Autocoded task kick-off (active components). Function provided by autocoder.
    startTasks(state);
}

void teardownTopology(const TopologyState& state) {
    // Autocoded (active component) task clean-up. Functions provided by topology autocoder.
    stopTasks(state);
    freeThreads(state);

    // Other task clean-up.
    //comDriver.quitReadThread();
    //(void)comDriver.join();

    tearDownComponents(state);
}
};  // namespace IntrepidPrime
