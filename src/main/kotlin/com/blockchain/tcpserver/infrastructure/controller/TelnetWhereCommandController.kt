package com.blockchain.tcpserver.infrastructure.controller

import com.blockchain.tcpserver.application.whereCommand.WhereCommandUseCase
import org.springframework.stereotype.Service

@Service
class TelnetWhereCommandController(private val whereCommandUseCase: WhereCommandUseCase) {

    operator fun invoke() : String {
        return "Machine name is ${whereCommandUseCase.process().name}"
    }
}