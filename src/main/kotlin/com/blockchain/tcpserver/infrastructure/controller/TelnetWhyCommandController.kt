package com.blockchain.tcpserver.infrastructure.controller

import com.blockchain.tcpserver.application.whyCommand.WhyCommandUseCase
import org.springframework.stereotype.Service

@Service
class TelnetWhyCommandController(private val whyCommandUseCase: WhyCommandUseCase) {

    operator fun invoke() : String {
        return "Ultimate answer is: ${whyCommandUseCase.process().ultimateAnswer}"
    }
}