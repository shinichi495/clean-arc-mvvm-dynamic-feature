package com.hdbank.core.extensions

import com.hdbank.core.data.NetworkResult

suspend fun <T> NetworkResult<T>.onSuccess(excutable: suspend (T?) -> Unit): NetworkResult<T> =
    apply {
        if (this is NetworkResult.Success<T>) excutable(data)
    }

suspend fun <T> NetworkResult<T>.onError(excutable: suspend (mess: String?, T?) -> Unit) = apply {
    if (this is NetworkResult.Error) excutable(errorMessage, data)
}

suspend fun <T> NetworkResult<T>.onException(excuatable: suspend (t: Throwable) -> Unit) = apply {
    if (this is NetworkResult.Exception) excuatable(e)
}

suspend fun <T> NetworkResult<T>.onLoading(excuatable: suspend (data: T?) -> Unit) = apply {
    if (this is NetworkResult.Loading) excuatable(data)
}