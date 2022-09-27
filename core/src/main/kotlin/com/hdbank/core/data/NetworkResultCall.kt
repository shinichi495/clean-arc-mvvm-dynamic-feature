package com.hdbank.core.data

import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NetworkResultCall<T>(private val proxy: Call<T>) : Call<NetworkResult<T>>{

    override fun enqueue(callback: Callback<NetworkResult<T>>)  = proxy.enqueue(object : Callback<T>{
        override fun onResponse(call: Call<T>, response: Response<T>) {
            val result = apiCall { response }
            callback.onResponse(this@NetworkResultCall, Response.success(result))
        }

        override fun onFailure(call: Call<T>, t: Throwable) {
            val err = NetworkResult.Exception<T>(t)
            callback.onResponse(this@NetworkResultCall,Response.success(err))
        }

    })



    override fun clone(): Call<NetworkResult<T>> = NetworkResultCall(proxy.clone())

    override fun execute(): Response<NetworkResult<T>> = throw NotImplementedError()

    override fun isExecuted(): Boolean = proxy.isExecuted

    override fun cancel() = proxy.cancel()

    override fun isCanceled(): Boolean = proxy.isCanceled

    override fun request(): Request = proxy.request()

    override fun timeout(): Timeout = proxy.timeout()
}