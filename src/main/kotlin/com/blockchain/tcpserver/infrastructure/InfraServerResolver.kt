package com.blockchain.tcpserver.infrastructure

import com.blockchain.tcpserver.domain.ServerResolver
import com.blockchain.tcpserver.infrastructure.config.TcpServerConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

@Service
class InfraServerResolver : ServerResolver {
    private val machineId = UUID.randomUUID().toString()

    @Value("\${tcp.server.name}")
    private val serverName = ""

    override fun getServerName(): String {
        return serverName + machineId
    }
}