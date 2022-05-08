package com.blockchain.tcpserver.application

import com.blockchain.tcpserver.domain.UltimateAnswer

class WhyCommandUseCase : CommandUseCase {

    override fun process() : String {
        val ultimateAnswer = UltimateAnswer()
        return ultimateAnswer.get()
    }
}