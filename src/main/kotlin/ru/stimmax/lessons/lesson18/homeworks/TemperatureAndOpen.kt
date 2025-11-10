package ru.stimmax.ru.stimmax.lessons.lesson18.homeworks

abstract class TemperatureOpenableEquipment : ProgrammableEquipment(), TemperatureRegulatable, Openable {
    protected var currentTemperature = 0
    protected var isOpened = false

    override fun setTemperature(temp: Int) {
        if (isPoweredOn) {
            if (temp <= maxTemperature) {
                currentTemperature = temp
                println("Temperature set to $temp°C")
            } else {
                println("Temperature too high - max is $maxTemperature°C")
            }
        } else {
            println("Cannot set temperature - device is off")
        }
    }

    override fun open() {
        isOpened = true
        println("Device opened")
    }

    override fun close() {
        isOpened = false
        println("Device closed")
    }
}