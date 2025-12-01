package ru.stimmax.ru.stimmax.lessons.lesson23.homework

// Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка. С помощью require проверь, что список не пустой.

fun averageOfEven(numbers: List<Int>): Double {
    require(numbers.isNotEmpty()) { "Список не должен быть пустым" }
    val evens = numbers.filter { it % 2 == 0 }
    return if (evens.isEmpty()) 0.0 else evens.average()
}

//     Создай аналогичную анонимную функцию.

val averageOfEvenAnon = fun(numbers: List<Int>): Double {
    require(numbers.isNotEmpty()) { "Список не должен быть пустым" }
    val evens = numbers.filter { it % 2 == 0 }
    return if (evens.isEmpty()) 0.0 else evens.average()
}

//     Создай аналогичное лямбда выражение с указанием типа.

val averageOfEvenLambda1: (List<Int>) -> Double = { numbers ->
    require(numbers.isNotEmpty()) { "Список не должен быть пустым" }
    val evens = numbers.filter { it % 2 == 0 }
    if (evens.isEmpty()) 0.0 else evens.average()
}

//     Создай лямбда выражение без указания типа.

val averageOfEvenLambda2 = { numbers: List<Int> ->
    require(numbers.isNotEmpty()) { "Список не должен быть пустым" }
    val evens = numbers.filter { it % 2 == 0 }
    if (evens.isEmpty()) 0.0 else evens.average()
}

//     Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).
//     В MAIN



// Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа. Сделай проверку, что входящее число больше нуля. Подсказка: для парсинга символа в число можно использовать функцию digitToInt()

fun sumOfDigits(number: Int): Int {
    require(number > 0) { "Число должно быть больше нуля" }
    return number.toString().sumOf { it.digitToInt() }
}

//     Создай аналогичную анонимную функцию.

val sumOfDigitsAnon = fun(number: Int): Int {
    require(number > 0) { "Число должно быть больше нуля" }
    return number.toString().sumOf { it.digitToInt() }
}

//     Создай аналогичное лямбда выражение с указанием типа.

val sumOfDigitsLambda1: (Int) -> Int = { number ->
    require(number > 0) { "Число должно быть больше нуля" }
    number.toString().sumOf { it.digitToInt() }
}

//     Создай лямбда выражение без указания типа.

val sumOfDigitsLambda2 = { number: Int ->
    require(number > 0) { "Число должно быть больше нуля" }
    number.toString().sumOf { it.digitToInt() }
}

//     Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
//     В MAIN



// Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел (встречающихся в списке более одного раза).

fun List<Int>.findDuplicates(): Set<Int> {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()
    forEach { num ->
        if (num in seen) duplicates.add(num) else seen.add(num)
    }
    return duplicates
}

//     Создай аналогичную анонимную функцию.

val findDuplicatesAnon = fun List<Int>.(): Set<Int> {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()
    forEach { num ->
        if (num in seen) duplicates.add(num) else seen.add(num)
    }
    return duplicates
}

//     Создай аналогичное лямбда выражение с указанием типа.

val findDuplicatesLambda: List<Int>.() -> Set<Int> = {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()
    forEach { num ->
        if (num in seen) duplicates.add(num) else seen.add(num)
    }
    duplicates
}

//     Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
//     В MAIN


fun main() {

    //1
    val testLists = listOf(
        listOf(1, 2, 3, 4, 5),
        listOf(2, 4, 6),
        listOf(1, 3, 5),
        listOf()
    )

    testLists.forEach { list ->
        try {
            println("Список: $list")
            println("Функция: ${averageOfEven(list)}")
            println("Анонимная: ${averageOfEvenAnon(list)}")
            println("Лямбда1: ${averageOfEvenLambda1(list)}")
            println("Лямбда2: ${averageOfEvenLambda2(list)}")
        } catch (e: IllegalArgumentException) {
            println("Ошибка: ${e.message}")
        }
        println()
    }


   //2
    val testNumbers = listOf(123, 456, 999, 1000, 0, -5)

    testNumbers.forEach { number ->
        try {
            println("Число: $number")
            println("Функция: ${sumOfDigits(number)}")
            println("Анонимная: ${sumOfDigitsAnon(number)}")
            println("Лямбда1: ${sumOfDigitsLambda1(number)}")
            println("Лямбда2: ${sumOfDigitsLambda2(number)}")
        } catch (e: IllegalArgumentException) {
            println("Ошибка: ${e.message}")
        }
        println()
    }

    //3
    val testLists1 = listOf(
        listOf(1, 2, 3, 4, 5),
        listOf(1, 2, 2, 3, 4, 4, 5),
        listOf(1, 1, 1, 2, 2),
        listOf()
    )

    testLists1.forEach { list ->
        println("Список: $list")
        println("Расширение: ${list.findDuplicates()}")
        println("Анонимная: ${findDuplicatesAnon(list)}")
        println("Лямбда: ${findDuplicatesLambda(list)}")
        println()
    }

}



