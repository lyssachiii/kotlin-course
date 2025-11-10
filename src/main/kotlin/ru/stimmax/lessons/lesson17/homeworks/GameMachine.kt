package ru.stimmax.ru.stimmax.lessons.lesson17.homeworks

class GameMachine {

    val color: String
    val model: String
    private var isOn: Boolean = false
    private var osLoaded: Boolean = false
    private val installedGames: MutableList<String> = mutableListOf()
    val hasJoystick: Boolean
    private var balance: Double = 0.0
    val owner: String
    val supportPhone: String
    private var sessionPaid: Boolean = false
    val sessionPrice: Double
    private val pinCode: String


    constructor(
        color: String,
        model: String,
        hasJoystick: Boolean,
        owner: String,
        supportPhone: String,
        sessionPrice: Double,
        pinCode: String
    ) {
        this.color = color
        this.model = model
        this.hasJoystick = hasJoystick
        this.owner = owner
        this.supportPhone = supportPhone
        this.sessionPrice = sessionPrice
        this.pinCode = pinCode
    }


    fun turnOn(): Boolean {
        isOn = true
        return isOn
    }

    fun turnOff(): Boolean {
        isOn = false
        osLoaded = false
        return isOn
    }

    private fun loadOS(): Boolean {
        if (isOn) {
            osLoaded = true
        }
        return osLoaded
    }

    private fun shutdownOS(): Boolean {
        osLoaded = false
        return osLoaded
    }

    fun showGames(): List<String> {
        return installedGames.toList()
    }

    fun startGame(game: String): Boolean {
        return isOn && osLoaded && sessionPaid && installedGames.contains(game)
    }

    fun paySession(money: Double): Boolean {
        if (money >= sessionPrice) {
            sessionPaid = true
            balance += sessionPrice
            return true
        }
        return false
    }

    fun collectCash(pin: String): Double {
        if (pin == pinCode) {
            val collected = balance
            balance = 0.0
            return collected
        }
        return 0.0
    }

    private fun openSafe(): Double {
        return balance
    }
}