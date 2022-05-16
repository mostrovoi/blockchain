package com.blockchain.tcpserver.infrastructure.config

import com.blockchain.tcpserver.application.whereCommand.WhereCommandUseCase
import com.blockchain.tcpserver.application.whoCommand.WhoCommandUseCase
import com.blockchain.tcpserver.application.whyCommand.WhyCommandUseCase
import com.blockchain.tcpserver.domain.ConnectionResolver
import com.blockchain.tcpserver.domain.ServerResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCasesBeanConfig(private val connectionResolver: ConnectionResolver, private val serverResolver: ServerResolver) {

    @Bean
    fun whoCommandUseCase() : WhoCommandUseCase {
        return WhoCommandUseCase(connectionResolver)
    }

    @Bean
    fun whereCommandUseCase() : WhereCommandUseCase {
        return WhereCommandUseCase(serverResolver)
    }

    @Bean
    fun whyCommandUseCase() : WhyCommandUseCase {
        return WhyCommandUseCase()
    }

}