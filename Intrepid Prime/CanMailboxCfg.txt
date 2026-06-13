# ======================================================================
# CAN Mailbox configuration
# ======================================================================

module CandoSvc {

  module CanMailboxCfg {

    # Less than 256 to fit in U8
    constant NumOfOutgoingMailboxes = 5
    constant NumOfIncomingMailboxes = 5

    constant CanMailboxSmallBufferSize = 32
    constant CanMailboxSmallBufferCount = 10
    constant CanMailboxMediumBufferSize = 128
    constant CanMailboxMediumBufferCount = 5
    constant CanMailboxBigBufferSize = 512
    constant CanMailboxBigBufferCount = 1

  }

}
