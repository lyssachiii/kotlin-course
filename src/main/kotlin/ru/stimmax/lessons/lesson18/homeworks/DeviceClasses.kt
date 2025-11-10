package ru.stimmax.ru.stimmax.lessons.lesson18.homeworks
import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

abstract class Refrigerator1 : Powerable, Openable, TemperatureRegulatable

abstract class WashingMachine1 : Powerable, WaterContainer, TemperatureRegulatable, Drainable, Programmable

abstract class SmartLamp : Powerable, LightEmitting, Programmable

abstract class ElectronicClock : Powerable, Timable, BatteryOperated

abstract class RobotVacuum : Powerable, Movable, Cleanable, Rechargeable, AutomaticShutdown

abstract class MechanicalClock : Mechanical, BatteryOperated

abstract class Flashlight : Powerable, LightEmitting, BatteryOperated

abstract class CoffeeMachine : Powerable, WaterContainer, Programmable, Openable

abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable