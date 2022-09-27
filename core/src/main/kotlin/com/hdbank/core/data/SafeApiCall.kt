package com.hdbank.core.data

import com.hd.utils.CONNECT_EXCEPTION
import com.hd.utils.SOCKET_TIME_OUT_EXCEPTION
import com.hd.utils.UNKNOWN_HOST_EXCEPTION
import com.hd.utils.UNKNOWN_NETWORK_EXCEPTION
import retrofit2.HttpException
import retrofit2.Response
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

suspend fun <T> safeApiCall(call : suspend () -> Response<T>) : NetworkResult<T> {
    try {
        val response = call.invoke()
        if (response.isSuccessful && response.body() != null) {
            return NetworkResult.Success(response.body())
        }
        return NetworkResult.Error(response.message())
    } catch (e : Exception) {
        return when (e) {
            is ConnectException -> NetworkResult.Error(CONNECT_EXCEPTION)
            is UnknownHostException -> NetworkResult.Error(UNKNOWN_HOST_EXCEPTION)
            is SocketTimeoutException -> NetworkResult.Error(SOCKET_TIME_OUT_EXCEPTION)
            is HttpException -> NetworkResult.Error(UNKNOWN_NETWORK_EXCEPTION)
            else -> NetworkResult.Exception(e)
        }
    }
}

fun <T> apiCall(call: () -> Response<T>) : NetworkResult<T> {
    try {
        val response = call.invoke()
        if (response.isSuccessful && response.body() != null) {
            return NetworkResult.Success(response.body())
        }
        return NetworkResult.Error(response.message())
    } catch (e : Exception) {
        return when (e) {
            is ConnectException -> NetworkResult.Error(CONNECT_EXCEPTION)
            is UnknownHostException -> NetworkResult.Error(UNKNOWN_HOST_EXCEPTION)
            is SocketTimeoutException -> NetworkResult.Error(SOCKET_TIME_OUT_EXCEPTION)
            is HttpException -> NetworkResult.Error(UNKNOWN_NETWORK_EXCEPTION)
            else -> NetworkResult.Exception(e)
        }
    }
}
