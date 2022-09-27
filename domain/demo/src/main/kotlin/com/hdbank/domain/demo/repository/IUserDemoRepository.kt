package com.hdbank.domain.demo.repository

import com.hdbank.core.data.NetworkResult
import com.hdbank.domain.demo.entities.UserDomainEntities.UserDomainResponse
import kotlinx.coroutines.flow.Flow

interface IUserDemoRepository {
    suspend fun getUsers(): NetworkResult<UserDomainResponse>
}