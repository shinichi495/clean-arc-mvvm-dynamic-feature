package com.hdbank.domain.demo

import com.hdbank.domain.demo.usecases.GetUsersDemoUseCase
import org.koin.dsl.module

val demoUsecaseModule = module {

    single<GetUsersDemoUseCase> {
        GetUsersDemoUseCase(get())
    }

}