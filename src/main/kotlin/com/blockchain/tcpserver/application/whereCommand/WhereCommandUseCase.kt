package com.blockchain.tcpserver.application.whereCommand

import com.blockchain.tcpserver.domain.ServerResolver

class WhereCommandUseCase constructor(private val serverResolver: ServerResolver) {

    fun process() : ServerNameDto {
        return ServerNameDto(serverResolver.getServerName())
    }
}