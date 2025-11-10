package ru.stimmax.ru.stimmax.lessons.lesson18.homeworks

abstract class PowerableEquipment : Powerable {
    protected var isPoweredOn = false

    override fun powerOn() {
        isPoweredOn = true
        println("Equipment powered on")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("Equipment powered off")
    }
}