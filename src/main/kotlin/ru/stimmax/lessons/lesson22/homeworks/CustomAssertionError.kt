package ru.stimmax.ru.stimmax.lessons.lesson22.homeworks

// Задание 11. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и принимающий текст. Выброси это исключение в main

class CustomAssertionError(message: String) : AssertionError(message)

fun main() {
    try {
        throw CustomAssertionError("Мое кастомное исключение!")
    } catch (e: Throwable) {
        e.printStackTrace()
    }
}