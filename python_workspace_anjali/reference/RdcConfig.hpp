#ifndef RDC_CONFIG_HPP_
#define RDC_CONFIG_HPP_

#include <Fw/FPrimeBasicTypes.hpp>

namespace RdcConfig
{

constexpr U32 K = 1000;
constexpr U32 M = K * 1000;

constexpr U8 RD_FRQ_HZ = 1000; //!< Rate Driver frequency in Hz

constexpr U32 RD_PERIOD_MS = K / RD_FRQ_HZ; //!< Rate duration in milliseconds

constexpr U8 RG_DIV_1 = 1;   //!< Rate Group 1 divisor
constexpr U8 RG_DIV_2 = 5;   //!< Rate Group 2 divisor
constexpr U8 RG_DIV_3 = 10;  //!< Rate Group 3 divisor

constexpr U8 RG_DIV_DEF_OFFSET = 0;

constexpr U8 PWM_RES = 16;
constexpr U8 PWM_PIN_MBS = 3;
constexpr U8 PWM_PIN_GIM = 9;
constexpr U8 PWM_PIN_FLY = 10;

constexpr U8 IO_PIN_LED = 13;

constexpr U8 IO_PIN_MBS_EN = 7;
constexpr U8 IO_PIN_MBS_DIR = 6;
constexpr U8 IO_PIN_GIM_EN = 11;
constexpr U8 IO_PIN_GIM_DIR = 8;
constexpr U8 IO_PIN_FLY_EN = IO_PIN_LED;
constexpr U8 IO_PIN_FLY_DIR = 12;

constexpr U8 UART_DEF_TXRX = 0;
constexpr U32 UART_DEF_BAUD_RATE = 115200;

} // namespace RdcConfig

#endif /* RDC_CONFIG_HPP_ */