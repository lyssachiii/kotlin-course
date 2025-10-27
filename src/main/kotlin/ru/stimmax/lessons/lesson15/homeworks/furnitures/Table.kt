package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.furnitures

class Table(material: String, price: Double, val shape: String) : Furniture(material, price) {
    val type = "Table"
}