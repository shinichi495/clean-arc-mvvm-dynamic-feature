package com.hdbank.core.usecase

import com.hdbank.core.data.NetworkResult

interface Usecase<in In, Out> {
    suspend fun run (params : In) : NetworkResult<Out>
    suspend operator fun invoke (params: In) : NetworkResult<Out> {
        val result = run(params)
        return result
    }
}