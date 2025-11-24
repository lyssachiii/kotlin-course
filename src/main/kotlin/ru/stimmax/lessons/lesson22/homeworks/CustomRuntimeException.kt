package ru.stimmax.ru.stimmax.lessons.lesson22.homeworks

class CustomRuntimeException(cause: IndexOutOfBoundsException) : RuntimeException(cause)

fun main() {
    try {
        val list = listOf(1, 2, 3)
        list[10] // IndexOutOfBoundsException
    } catch (e: IndexOutOfBoundsException) {
        println("Пойман IndexOutOfBoundsException")
        throw CustomRuntimeException(e)
    }
}

