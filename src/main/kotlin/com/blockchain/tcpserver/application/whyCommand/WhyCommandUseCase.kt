package com.blockchain.tcpserver.application.whyCommand

import com.blockchain.tcpserver.domain.UltimateAnswer

class WhyCommandUseCase  {

    fun process() : UltimateAnswerDto {
        val ultimateAnswer = UltimateAnswer()
        return UltimateAnswerDto(ultimateAnswer.get())
    }
}