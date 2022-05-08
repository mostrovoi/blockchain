package com.blockchain.tcpserver.application

import com.blockchain.tcpserver.domain.ConnectionResolver

class WhoCommandUseCase constructor(private val connectionResolver: ConnectionResolver) : CommandUseCase {

    override fun process() : String {
        return connectionResolver.getUsersConnected()
    }
}