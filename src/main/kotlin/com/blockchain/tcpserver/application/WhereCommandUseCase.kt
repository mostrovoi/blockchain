package com.blockchain.tcpserver.application

import com.blockchain.tcpserver.domain.ServerResolver

class WhereCommandUseCase constructor(private val machineResolver: ServerResolver): CommandUseCase {

    override fun process() : String {
        return machineResolver.getServerName()
    }
}