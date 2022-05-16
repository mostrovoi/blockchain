package com.blockchain.tcpserver.application

import com.blockchain.tcpserver.application.whereCommand.ServerNameDto
import com.blockchain.tcpserver.application.whereCommand.WhereCommandUseCase
import com.blockchain.tcpserver.domain.ServerResolver
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WhereCommandUseCaseTest {

    @Test
    fun `should return machine name when processed`() {
        //given
        val serverResolverService = mockk<ServerResolver>()
        every { serverResolverService.getServerName() } returns "MY MACHINE"
        val whereCommandUseCase = WhereCommandUseCase(serverResolverService)

        //when
        val response = whereCommandUseCase.process()

        //then
        assertEquals(ServerNameDto("MY MACHINE"), response)
    }
}
