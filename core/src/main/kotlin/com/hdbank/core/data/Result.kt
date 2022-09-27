package com.hdbank.core.data

sealed class NetworkResult<T>(val data: T? = null, val errorMessage: String? = null) {

    class Success<T>(data: T?) : NetworkResult<T>(data)
    class Error<T>(errorMessage: String?, data: T? = null) :
        NetworkResult<T>(data, errorMessage)
    class Exception<T> (val e : Throwable) : NetworkResult<T>()
    class Loading<T>(data: T? = null) : NetworkResult<T>(data)

}