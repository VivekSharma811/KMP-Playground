package com.hypheno.hello.di

import com.hypheno.hello.dependencies.MyRepository
import com.hypheno.hello.dependencies.MyRepositoryImpl
import com.hypheno.hello.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule  = module {
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
    viewModelOf(::MyViewModel)
}
