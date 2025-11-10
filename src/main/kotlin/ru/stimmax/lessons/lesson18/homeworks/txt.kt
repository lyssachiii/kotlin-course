package ru.stimmax.ru.stimmax.lessons.lesson18.homeworks

// Интерфейсы для работы
//
// interface Powerable {
//    fun powerOn()
//    fun powerOff()
// }
//
// interface Openable {
//    fun open()
//    fun close()
// }
//
// interface WaterContainer {
//    val capacity: Int
//    fun fillWater(amount: Int)
//    fun getWater(amount: Int)
// }
//
// interface TemperatureRegulatable {
//    val maxTemperature: Int
//    fun setTemperature(temp: Int)
// }
//
// interface WaterConnection {
//    fun connectToWaterSupply()
//    fun getWater(amount: Int)
// }
//
// interface AutomaticShutdown {
//    val sensorType: String
//    val maxSensoredValue: Int
//    fun startMonitoring()
// }
//
// interface Drainable {
//    fun connectToDrain()
//    fun drain()
// }
//
// interface Timable {
//    fun setTimer(time: Int)
// }
//
// interface BatteryOperated {
//    fun getCapacity(): Double
//    fun replaceBattery()
// }
//
// interface Mechanical {
//    fun performMechanicalAction()
// }
//
// interface LightEmitting {
//    fun emitLight()
//    fun completeLiteEmission()
// }
//
// interface SoundEmitting {
//    fun setVolume(volume: Int)
//    fun mute()
//    fun playSound(stream: InputStream)
// }
//
// interface Programmable {
//    fun programAction(action: String)
//    fun execute()
// }
//
// interface Movable {
//    fun move(direction: String, distance: Int)
// }
//
// interface Cleanable {
//    fun clean()
// }
//
// interface Rechargeable {
//    fun getChargeLevel(): Double
//    fun recharge()
// }
//
// Задача 1. Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.
//
//     Холодильник
//     Стиральная машина
//     Умная лампа
//     Электронные часы
//     Робот-пылесос
//     Механические часы
//     Фонарик
//     Кофемашина
//     Умная колонка
//
// Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс с реализацией методов (достаточно println с выполняемым действием).
//
// Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.
//
// Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.
//
// Задача 5. Создай не абстрактные классы устройств с наследованием от абстрактного класса с возможностью устанавливать температуру и открываться. Пусть это будет холодильник, стиральная машина, чайник, духовка. Добавь недостающие интерфейсы и реализуй необходимые методы (достаточно вывод в консоль производимого действия). Обрати внимание на то, что установка температуры и программирование устройства (считай - задание режима работы) не имеет смысла при выключенном питании - добавь эту проверку.
//
// Создай объекты этих устройств и позапускай их с различными методами.