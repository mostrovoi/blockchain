package com.blockchain.tcpserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TcpserverApplication

fun main(args: Array<String>) {
	runApplication<TcpserverApplication>(*args)
}
