package com.hdbank.domain.demo.usecases

import com.hdbank.core.data.NetworkResult
import com.hdbank.core.usecase.Usecase
import com.hdbank.domain.demo.entities.UserDomainEntities
import com.hdbank.domain.demo.repository.IUserDemoRepository
import java.util.concurrent.Flow

private typealias GetUsersDemoBaseUsecase = Usecase<Unit, UserDomainEntities.UserDomainResponse>

class GetUsersDemoUseCase(private val userDemoRepository: IUserDemoRepository) :
    GetUsersDemoBaseUsecase {
    override suspend fun run(params: Unit): NetworkResult<UserDomainEntities.UserDomainResponse> =
        userDemoRepository.getUsers()
}