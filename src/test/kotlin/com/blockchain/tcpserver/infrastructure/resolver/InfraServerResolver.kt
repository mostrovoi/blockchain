package com.blockchain.tcpserver.infrastructure.resolver

import com.blockchain.tcpserver.domain.ServerResolver
import org.hamcrest.Matchers.matchesPattern
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.mockito.internal.matchers.Matches
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class InfraServerResolver {

    @Autowired
    private lateinit var serverResolver: ServerResolver

    @Test
    fun `should return machine name when asked`() {
        assertTrue( serverResolver.getServerName().startsWith("blockchain1"))
    }
}