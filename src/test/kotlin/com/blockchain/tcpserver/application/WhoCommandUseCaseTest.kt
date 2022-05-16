package com.blockchain.tcpserver.application

import com.blockchain.tcpserver.application.whoCommand.UserConnectedDto
import com.blockchain.tcpserver.application.whoCommand.WhoCommandUseCase
import com.blockchain.tcpserver.domain.ConnectionResolver
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WhoCommandUseCaseTest {

    @Test
    fun `should return 3 users connected command when processed`() {
        //given
        val connectionResolverService = mockk<ConnectionResolver>()
        every { connectionResolverService.getUsersConnected() } returns 3
        val whoCommandUseCase = WhoCommandUseCase(connectionResolverService)

        //when
        val response = whoCommandUseCase.process()

        //then
        assertEquals(UserConnectedDto(3), response)
    }
}
