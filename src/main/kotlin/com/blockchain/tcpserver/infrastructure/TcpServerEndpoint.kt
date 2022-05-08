package com.blockchain.tcpserver.infrastructure

import org.springframework.integration.annotation.MessageEndpoint
import org.springframework.integration.annotation.ServiceActivator

@MessageEndpoint
class TcpServerEndpoint constructor(private val useCaseResolver: UseCaseResolver) {
    @ServiceActivator(inputChannel = "inboundChannel")
    fun process(command: ByteArray): ByteArray {
        val commandAsString = String(command)
        return useCaseResolver.process(commandAsString).toByteArray()
    }
}