package com.blockchain.tcpserver.domain

interface ConnectionResolver {
    fun getUsersConnected() : Int
}
