package com.hdbank.core.koin

import org.koin.dsl.module

val remoteCoreModule = module {
    single { RemoteUtils.provideRetrofit(okHttpClient = get(), url = "") }
    single { RemoteUtils.provideOkHttpClient() }
}