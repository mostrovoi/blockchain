package com.blockchain.tcpserver.infrastructure.resolver

import com.blockchain.tcpserver.domain.ConnectionResolver
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class InfraConnectionResolverTest {

    @Autowired
    private lateinit var connectionResolver: ConnectionResolver

    @Test
    fun `should return 0 users connected when no user has been connected`() {
        assertEquals(0, connectionResolver.getUsersConnected())
    }
}