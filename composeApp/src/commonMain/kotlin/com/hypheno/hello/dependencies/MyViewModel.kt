package com.hypheno.hello.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(
    private val repository: MyRepository
): ViewModel() {

    fun getHelloWorldString() = repository.helloWorld()
}