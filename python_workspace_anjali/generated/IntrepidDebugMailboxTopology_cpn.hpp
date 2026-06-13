// ======================================================================
// Generated CAN Mailbox topology configuration
// Source model: intrepid.ucof
// Device: cpn
// Target implementation: va41620peb1 / ebi-ethernet board
// Mailbox config: CPN_CAN_Mailbox_Config
// Node address symbol: CAN_ADDR_CPN
// ======================================================================

static CandoSvc::CanMailbox::CDSP_DADR s_canFilterList[] = {CandoSvc::CAN_ADDR_CPN};
static CandoSvc::CanMailbox::MailboxOutConfig s_canMbOut[] = {
    {0x0, CandoSvc::CAN_ADDR_CPN, CandoSvc::CAN_ADDR_RDC_2},
    {0x0, CandoSvc::CAN_ADDR_CPN, CandoSvc::CAN_ADDR_RDC_MC, true /*Multicast out*/}};
static CandoSvc::CanMailbox::CDSP_SADR s_canSenderFilterList[] = {CandoSvc::CAN_ADDR_RDC_2};

// Configure CAN Controller and CAN Mailbox
canMailbox.setup(s_canFilterList, FW_NUM_ARRAY_ELEMENTS(s_canFilterList),
                 s_canMbOut, FW_NUM_ARRAY_ELEMENTS(s_canMbOut),
                 s_canSenderFilterList, FW_NUM_ARRAY_ELEMENTS(s_canSenderFilterList));
canDriver.open(Va416x0Mmio::CAN0, Va416x0Drv::CanDriver::BAUD_500K, Va416x0Drv::CanDriver::DIAGNOSTIC, true, 64);
