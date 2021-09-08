package com.example.koindepndencyinjection.di

import com.example.koindepndencyinjection.repository.Machine
import com.example.koindepndencyinjection.repository.MachineAccess
import com.example.koindepndencyinjection.repository.MachineImpl
import com.example.koindepndencyinjection.utils.*
import com.example.koindepndencyinjection.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.binds
import org.koin.dsl.module

val appModule = module {

    factory { Car(get(), get()) }
    factory { Engine() }
    factory { Wheel() }

    // three method to provide di
    // factory { MachineImpl() }
    factory<Machine> { MachineImpl() } //recommended method
    // factory { MachineImpl() } bind Machine::class

    factory { MachineAccess(get()) }

    factory { TestImpl() } binds arrayOf(Test1::class, Test2::class)
    viewModel { HomeViewModel(get(),get()) }
}