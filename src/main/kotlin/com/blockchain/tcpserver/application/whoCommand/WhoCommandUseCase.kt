package com.blockchain.tcpserver.application.whoCommand

import com.blockchain.tcpserver.domain.ConnectionResolver

class WhoCommandUseCase constructor(private val connectionResolver: ConnectionResolver)  {

    fun process() : UserConnectedDto {
        return UserConnectedDto(connectionResolver.getUsersConnected())
    }
}