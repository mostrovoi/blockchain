package com.blockchain.tcpserver.infrastructure.controller

import com.blockchain.tcpserver.application.whoCommand.WhoCommandUseCase
import org.springframework.stereotype.Service

@Service
class TelnetWhoCommandController(private val whoCommandUseCase: WhoCommandUseCase) {

    operator fun invoke() : String {
        return "Users connected: ${whoCommandUseCase.process().usersConnected}"
    }
}