package com.hdbank.core.data

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import retrofit2.HttpException


@ExperimentalCoroutinesApi
inline fun <ResultType, RequestType> networkboundResource(
    crossinline query: () -> Flow<ResultType>,
    crossinline fetch: suspend () -> RequestType,
    crossinline saveFetchResult: suspend (RequestType) -> Unit,
    crossinline clearData: suspend () -> Unit = {},
    crossinline onFetchFailed: (Throwable) -> Unit = {},
    crossinline shouldFetch: (ResultType) -> Boolean = { true },
    crossinline shouldClear: (ResultType, RequestType) -> Boolean = { resultType: ResultType, requestType: RequestType -> false }
) = flow {
    emit(NetworkResult.Loading())

    val dbData = query().first()
    val flow = if (shouldFetch(dbData)) {
        emit(NetworkResult.Loading(dbData))
        try {
            val fetchData = fetch()
            if (shouldClear(dbData, fetchData)) clearData()
            saveFetchResult(fetchData)
            query().map { NetworkResult.Success(it) }
        } catch (throwable: Throwable) {
            onFetchFailed(throwable)
            query().map {
                NetworkResult.Error(throwable.message, it)
            }
        }
    } else {
        query().map { NetworkResult.Success(it) }
    }
    emitAll(flow)
}