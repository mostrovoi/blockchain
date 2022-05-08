package com.blockchain.tcpserver.infrastructure

import com.blockchain.tcpserver.domain.ServerResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InfraMachineResolver : ServerResolver {
    @Autowired
    private lateinit var tcpServerConfig : TcpServerConfig

    override fun getServerName(): String {
        return tcpServerConfig.serverName
    }
}