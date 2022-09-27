package com.hdbank.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hdbank.core.data.NetworkResult
import com.hdbank.core.extensions.onError
import com.hdbank.core.extensions.onException
import com.hdbank.core.extensions.onLoading
import com.hdbank.core.extensions.onSuccess
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    val loading = MutableLiveData<Boolean>()
    val error = MutableLiveData<String>()

    protected fun <Data> launchCoroutine(block: suspend CoroutineScope.() -> NetworkResult<Data>): Job {
        return viewModelScope.launch {
            val result = block()

            result.onSuccess {
                loading.value = false
            }

            result.onError { err, data ->
                loading.value = false
                error.value = err
            }

            result.onException { t ->
                loading.value = false
                error.value = t.message
            }

            result.onLoading {
                loading.value = true
            }
        }
    }


}