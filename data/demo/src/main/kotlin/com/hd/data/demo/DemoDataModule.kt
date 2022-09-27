package com.hd.data.demo

import com.hd.data.demo.remote.api.DemoApi
import com.hd.data.demo.remote.datasource.IRemoteDemoDataSource
import com.hd.data.demo.remote.datasource.RemoteDemoDataSource
import com.hd.data.demo.repository.UsersDemoRepository
import com.hdbank.domain.demo.repository.IUserDemoRepository
import org.koin.dsl.module
import retrofit2.Retrofit

val demoDataModule = module {

    single { provideDemoApiService(retrofit = get()) }

    single<IRemoteDemoDataSource> {
        RemoteDemoDataSource(apis = get())
    }

    single<IUserDemoRepository> {
        UsersDemoRepository(dataSource = get())
    }

}

private fun provideDemoApiService(retrofit: Retrofit): DemoApi =
    retrofit.create(DemoApi::class.java)