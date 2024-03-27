package com.plcoding.cryptocurrencyappyt.domain.repository

import com.plcoding.cryptocurrencyappyt.data.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun  getCoinById(coinId: String): CoinDetailDto
}