package com.hd.data.demo.remote.datasource

import com.hdbank.core.data.NetworkResult
import com.hdbank.domain.demo.entities.UserDomainEntities

interface IRemoteDemoDataSource {
    suspend fun getUsersDemo () : NetworkResult<UserDomainEntities.UserDomainResponse>
}