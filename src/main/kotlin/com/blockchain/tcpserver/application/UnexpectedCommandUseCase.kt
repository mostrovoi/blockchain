package com.blockchain.tcpserver.application

class UnexpectedCommandUseCase : CommandUseCase {
    override fun process(): String {
        return "Unexpected command"
    }
}