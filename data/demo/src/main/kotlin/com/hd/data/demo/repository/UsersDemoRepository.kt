package com.hd.data.demo.repository

import com.hd.data.demo.remote.datasource.IRemoteDemoDataSource
import com.hdbank.core.data.NetworkResult
import com.hdbank.domain.demo.entities.UserDomainEntities
import com.hdbank.domain.demo.repository.IUserDemoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UsersDemoRepository(private val dataSource: IRemoteDemoDataSource) : IUserDemoRepository {
    override suspend fun getUsers(): NetworkResult<UserDomainEntities.UserDomainResponse> = dataSource.getUsersDemo()
}