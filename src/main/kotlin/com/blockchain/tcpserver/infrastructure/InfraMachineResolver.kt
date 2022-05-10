package com.blockchain.tcpserver.infrastructure

import com.blockchain.tcpserver.domain.ServerResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class InfraMachineResolver : ServerResolver {
    private val machineId = UUID.randomUUID().toString()

    @Autowired
    private lateinit var tcpServerConfig : TcpServerConfig

    override fun getServerName(): String {
        return tcpServerConfig.serverName + machineId
    }
}