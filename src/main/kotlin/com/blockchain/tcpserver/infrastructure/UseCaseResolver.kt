package com.blockchain.tcpserver.infrastructure

import com.blockchain.tcpserver.infrastructure.controller.TelnetWhereCommandController
import com.blockchain.tcpserver.infrastructure.controller.TelnetWhoCommandController
import com.blockchain.tcpserver.infrastructure.controller.TelnetWhyCommandController
import org.springframework.stereotype.Service

@Service
class UseCaseResolver constructor(val telnetWhoCommandController: TelnetWhoCommandController, val telnetWhereCommandController: TelnetWhereCommandController, val telnetWhyCommandController: TelnetWhyCommandController) {
    enum class ValidCommands {
        WHERE, WHO, WHY
    }

    fun process(command: String) : String {
        return when(command) {
            ValidCommands.WHERE.name -> telnetWhereCommandController()
            ValidCommands.WHO.name -> telnetWhoCommandController()
            ValidCommands.WHY.name -> telnetWhyCommandController()
            else -> "Unexpected command"
        }
    }
}