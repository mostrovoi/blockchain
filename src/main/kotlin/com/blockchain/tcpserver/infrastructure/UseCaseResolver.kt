package com.blockchain.tcpserver.infrastructure

import com.blockchain.tcpserver.application.UnexpectedCommandUseCase
import com.blockchain.tcpserver.application.WhereCommandUseCase
import com.blockchain.tcpserver.application.WhoCommandUseCase
import com.blockchain.tcpserver.application.WhyCommandUseCase
import com.blockchain.tcpserver.domain.ConnectionResolver
import com.blockchain.tcpserver.domain.ServerResolver
import org.springframework.stereotype.Service

@Service
class UseCaseResolver constructor(connectionResolver: ConnectionResolver, machineResolver: ServerResolver) {
    enum class ValidCommands {
        WHERE, WHO, WHY
    }
    private val whereCommandUseCase = WhereCommandUseCase(machineResolver)
    private val whoCommandUseCase = WhoCommandUseCase(connectionResolver)
    private val whyCommandUseCase = WhyCommandUseCase()
    private val unexpectedCommandUseCase = UnexpectedCommandUseCase()

    fun process(command: String) : String {
        return when(command) {
            ValidCommands.WHERE.name -> whereCommandUseCase.process()
            ValidCommands.WHO.name -> whoCommandUseCase.process()
            ValidCommands.WHY.name -> whyCommandUseCase.process()
            else -> unexpectedCommandUseCase.process()
        }
    }
}