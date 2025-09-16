package ru.stimmax.ru.stimmax.lessons.lesson05.homeworks

fun main() {
    // Задача 1
    val baseIntensity: Double = 100.0
    val dampingCoef: Double? = 0.6 // иногда null
    val baseDampingCoef: Double = 0.5
    val finalIntensity = baseIntensity * (dampingCoef ?: baseDampingCoef)

    // Задача 2
    val deliveryPrice: Double = 10.0
    val cargoPrice: Double? = 100.0 //иногда null
    val insuranceCoef: Double = 0.005
    val baseInsurancePrice: Double = 50.0
    val insurancePrice = (cargoPrice ?: baseInsurancePrice) * insuranceCoef
    val finalPrice = deliveryPrice + insurancePrice

    // Задача 3
    val pressure: Double? = 755.5 // иногда null
    val warning: String = "WARNING: NO PRESSURE DETECTED!!!"
    val pressureIndicator = pressure ?: warning
}