package com.blockchain.tcpserver.application

import com.blockchain.tcpserver.application.whyCommand.UltimateAnswerDto
import com.blockchain.tcpserver.application.whyCommand.WhyCommandUseCase
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WhyCommandUseCaseTest {

    @Test
    fun `should return ultimate answer command when processed`() {
        val whyCommandUseCase = WhyCommandUseCase()
        val response = whyCommandUseCase.process()
        assertEquals(UltimateAnswerDto(42), response)
    }
}