package com.hd.data.demo.remote.api

import com.hdbank.domain.demo.entities.UserDomainEntities
import retrofit2.Response


interface DemoApi {
    suspend fun getUsers () : Response<UserDomainEntities.UserDomainResponse>
}