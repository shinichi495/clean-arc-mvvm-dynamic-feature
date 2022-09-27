package com.hd.data.demo.remote.datasource

import com.hd.data.demo.remote.api.DemoApi
import com.hdbank.core.data.NetworkResult
import com.hdbank.core.data.safeApiCall
import com.hdbank.domain.demo.entities.UserDomainEntities

class RemoteDemoDataSource(private val apis : DemoApi) : IRemoteDemoDataSource {
    override suspend fun getUsersDemo(): NetworkResult<UserDomainEntities.UserDomainResponse> = safeApiCall {
        apis.getUsers()
    }
}