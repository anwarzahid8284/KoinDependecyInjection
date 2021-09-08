package com.example.koindepndencyinjection.components

import com.example.koindepndencyinjection.repository.MachineAccess
import com.example.koindepndencyinjection.utils.Car
import com.example.koindepndencyinjection.viewmodel.HomeViewModel
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

@KoinApiExtension
class InjectionComponent : KoinComponent {
    // two method of injection

    //first: recommended method of injection (lazily)
    val car: Car by inject()
    val machineAccess: MachineAccess by inject()
    val homeViewModel: HomeViewModel by inject()

    // second:  (eagerly)
    val car1: Car = get()
}