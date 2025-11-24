package ru.stimmax.ru.stimmax.lessons.lesson21.homework

// Задача 1
//
// Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип аргумента и вывести соответствующее сообщение:
//
//     Для строки: "Это строка: [значение]".
//     Для любого числа: "Это число: [значение]".
//     Для списка: "Это список, количество элементов: [количество]".
//     Для словаря: "Это словарь, количество пар: [количество]".
//     Для остальных типов: "Неизвестный тип данных".

// Используйте оператор is для проверки типов.

fun analyzeDataType(obj: Any) {
    when (obj) {
        is String -> println("Это строка: $obj")
        is Number -> println("Это число: $obj")
        is List<*> -> println("Это список, количество элементов: ${obj.size}")
        is Map<*, *> -> println("Это словарь, количество пар: ${obj.size}")
        else -> println("Неизвестный тип данных")
    }
}

// Задача 2
//
// Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка, если аргумент можно безопасно привести к типу List. В случае неудачного приведения функция должна возвращать -1. Используйте as? для безопасного приведения типа.

fun safeCastToList(obj: Any): Int = (obj as? List<*>)?.size ?: -1

// Задача 3
//
// Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и возвращает длину строки, если аргумент можно привести к типу String. В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.

fun getStringLengthOrZero(obj: Any?): Int = (obj as? String)?.length ?: 0

// Задача 4
//
// Создайте функцию-расширение класса Any toSquare. Функция гарантированно вызывается у числа (в виде числа или строки, например 4 или 4.2 или "4.2") и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат, если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.

fun Any.toSquare(): Double = when (this) {
    is Number -> this.toDouble() * this.toDouble()
    is String -> this.toDouble() * this.toDouble()
    else -> 0.0
}

// Задача 5
//
// Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму всех целочисленных (Int) и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.

fun sumIntOrDoubleValues(list: List<Any>): Double =
    list.sumOf {
        when (it) {
            is Int -> it.toDouble()
            is Double -> it
            else -> 0.0
        }
    }

// Задача 6

// Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>. Если приведение успешно, функция должна напечатать все строки из списка, если элемент не является строкой то вывести предупреждение об этом. Если приведение неудачно, должно быть выведено сообщение об ошибке, не прерывая выполнение программы.

fun tryCastToListAndPrint(obj: Any) {
    val list = obj as? List<*>
    if (list != null) {
        list.forEachIndexed { index, item ->
            if (item is String) {
                println(item)
            } else {
                println("Элемент $index не является строкой")
            }
        }
    } else {
        println("Ошибка: невозможно привести к списку")
    }
}


fun main() {
    analyzeDataType("hello, fellow kids")
    analyzeDataType(42)
    analyzeDataType(listOf(1, 2, 3))
    analyzeDataType(mapOf("a" to 1))
    analyzeDataType(true)

    println(safeCastToList(listOf(1, 2, 3)))
    println(safeCastToList("not a list"))

    println(getStringLengthOrZero("hello"))
    println(getStringLengthOrZero(42))
    println(getStringLengthOrZero(null))

    println(4.toSquare())
    println(2.5.toSquare())
    println("3".toSquare())
    println(true.toSquare())

    val list = listOf(1, 2.5, "hello", 3, true, 4.2)
    println(sumIntOrDoubleValues(list))

    tryCastToListAndPrint(listOf("a", 1, "b"))
    tryCastToListAndPrint("not a list")
}

