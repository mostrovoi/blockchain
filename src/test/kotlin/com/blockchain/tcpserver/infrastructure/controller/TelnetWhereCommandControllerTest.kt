package com.blockchain.tcpserver.infrastructure.controller

import com.blockchain.tcpserver.application.whereCommand.WhereCommandUseCase
import com.blockchain.tcpserver.application.whoCommand.WhoCommandUseCase
import com.blockchain.tcpserver.application.whyCommand.WhyCommandUseCase
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class TelnetCommandControllersTest {

    @Autowired
    private lateinit var  whereCommandUseCase : WhereCommandUseCase

    @Autowired
    private lateinit var  whoCommandUseCase : WhoCommandUseCase

    @Autowired
    private lateinit var  whyCommandUseCase : WhyCommandUseCase


    @Test
    fun `should return machine name formatted properly for where command`() {
        //given
        val telnetWhereCommandController = TelnetWhereCommandController(whereCommandUseCase)

        //when
        val response = telnetWhereCommandController.invoke()

        //then
        assertTrue(response.startsWith("Machine name is blockchain1"))
    }

    @Test
    fun `should return number of connections properly formatted for who command`() {
        //given
        val telnetWhoCommandController = TelnetWhoCommandController(whoCommandUseCase)

        //when
        val response = telnetWhoCommandController.invoke()

        //then
        assertEquals("Users connected: 0", response)
    }

    @Test
    fun `should return the ultimate answer properly formatted for why command`() {
        //given
        val telnetWhyCommandController = TelnetWhyCommandController(whyCommandUseCase)

        //when
        val response = telnetWhyCommandController.invoke()

        //then
        assertEquals("Ultimate answer is: 42", response)
    }
}