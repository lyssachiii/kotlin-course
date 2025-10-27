package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.furnitures

class Chair(material: String, price: Double, val legs: Int) : Furniture(material, price) {
    val type = "Chair"
}