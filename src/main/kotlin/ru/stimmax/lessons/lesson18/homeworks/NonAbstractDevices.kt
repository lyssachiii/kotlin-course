package ru.stimmax.ru.stimmax.lessons.lesson18.homeworks



class Refrigerator : TemperatureOpenableEquipment(), WaterContainer {
    override val maxTemperature = 10
    override val capacity = 1000

    override fun fillWater(amount: Int) {
        println("Filling water dispenser: $amount ml")
    }

    override fun getWater(amount: Int) {
        println("Dispensing water: $amount ml")
    }
}

class WashingMachine : TemperatureOpenableEquipment(), WaterContainer, Drainable {
    override val maxTemperature = 90
    override val capacity = 5000

    override fun fillWater(amount: Int) {
        if (isPoweredOn) {
            println("Filling water: $amount ml")
        } else {
            println("Cannot fill water - machine is off")
        }
    }

    override fun getWater(amount: Int) {
        println("Getting water: $amount ml")
    }

    override fun connectToDrain() {
        println("Connected to drain pipe")
    }

    override fun drain() {
        if (isPoweredOn) {
            println("Draining water from machine")
        } else {
            println("Cannot drain - machine is off")
        }
    }
}

class Kettle : TemperatureOpenableEquipment(), WaterContainer {
    override val maxTemperature = 100
    override val capacity = 2000

    override fun fillWater(amount: Int) {
        println("Filling kettle with $amount ml water")
    }

    override fun getWater(amount: Int) {
        println("Pouring $amount ml water from kettle")
    }
}

class Oven : TemperatureOpenableEquipment() {
    override val maxTemperature = 250

    override fun open() {
        super.open()
        println("Oven door opened - careful, hot!")
    }

    override fun close() {
        super.close()
        println("Oven door closed securely")
    }
}


fun main() {
    println("=== Testing Refrigerator ===")
    val fridge = Refrigerator()
    fridge.powerOn()
    fridge.setTemperature(5)
    fridge.programAction("Eco Cooling")
    fridge.execute()
    fridge.open()
    fridge.fillWater(500)
    fridge.getWater(200)
    fridge.close()

    println("\n=== Testing Washing Machine ===")
    val washer = WashingMachine()
    washer.powerOn()
    washer.setTemperature(40)
    washer.programAction("Cotton Wash")
    washer.execute()
    washer.fillWater(3000)
    washer.connectToDrain()
    washer.drain()

    println("\n=== Testing Kettle ===")
    val kettle = Kettle()
    kettle.powerOn()
    kettle.setTemperature(100)
    kettle.fillWater(1500)
    kettle.programAction("Boil")
    kettle.execute()

    println("\n=== Testing Oven ===")
    val oven = Oven()
    oven.powerOn()
    oven.setTemperature(180)
    oven.programAction("Baking")
    oven.execute()
    oven.open()
    oven.close()

    println("\n=== Testing Power Off Protection ===")
    kettle.powerOff()
    kettle.setTemperature(80) // Should fail
    kettle.programAction("Keep Warm") // Should fail
}