package com.example.koindepndencyinjection.repository

class MachineAccess(private val machine: Machine) {
    fun machineAccess() {
        machine.getMachine()
    }
}