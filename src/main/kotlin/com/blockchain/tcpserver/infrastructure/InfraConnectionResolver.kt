package com.blockchain.tcpserver.infrastructure

import com.blockchain.tcpserver.domain.ConnectionResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.integration.ip.tcp.connection.AbstractServerConnectionFactory
import org.springframework.stereotype.Service

@Service
class InfraConnectionResolver : ConnectionResolver {

    @Autowired
    private lateinit var serverConnectionFactory : AbstractServerConnectionFactory

    override fun getUsersConnected(): String {
        return String.format("%d", serverConnectionFactory.openConnectionIds.size)
    }
}