package com.blockchain.tcpserver.infrastructure

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.integration.channel.DirectChannel
import org.springframework.integration.ip.tcp.TcpInboundGateway
import org.springframework.integration.ip.tcp.connection.AbstractServerConnectionFactory
import org.springframework.integration.ip.tcp.connection.TcpNioServerConnectionFactory
import org.springframework.messaging.MessageChannel

@Configuration
class TcpServerConfig {
    @Value("\${tcp.server.port}")
    private val port = 0

    @Value("\${tcp.server.name}")
    val serverName = ""

    @Bean
    fun serverConnectionFactory(): AbstractServerConnectionFactory {
        val serverConnectionFactory = TcpNioServerConnectionFactory(port)
        serverConnectionFactory.setUsingDirectBuffers(true)
        return serverConnectionFactory
    }

    @Bean
    fun inboundChannel(): MessageChannel {
        return DirectChannel()
    }

    @Bean
    fun inboundGateway(serverConnectionFactory: AbstractServerConnectionFactory, inboundChannel: MessageChannel): TcpInboundGateway {
        val tcpInboundGateway = TcpInboundGateway()
        tcpInboundGateway.setConnectionFactory(serverConnectionFactory)
        tcpInboundGateway.setRequestChannel(inboundChannel)
        return tcpInboundGateway
    }
}