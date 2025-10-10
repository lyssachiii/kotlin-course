package ru.stimmax.ru.stimmax.lessons.lesson11.homework

//Задачи на сигнатуру метода

//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.

// Не принимает аргументов и не возвращает значения.

fun one(){}

// Принимает два целых числа и возвращает их сумму.

fun two(a: Int, b: Int):  Int = a + b

// Принимает строку и ничего не возвращает.

fun three(str3: String) {}

// Принимает список целых чисел и возвращает среднее значение типа Double.

fun four (list: List<Int>): Double = list.average()

// Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.

private fun five(nStr: String?): Int? {
    return nStr?.length
}

// Не принимает аргументов и возвращает nullable вещественное число.

fun six(): Float? {
    return null
}

// Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.

private fun seven(intList: List<Int>?) {}

// Принимает целое число и возвращает nullable строку.

fun eight(int1: Int): String? {
    return if (int1> 0) int1.toString() else null
}

// Не принимает аргументов и возвращает список nullable строк.

fun nine(): List<String>? {
    return null
}

// Принимает nullable строку и nullable целое число и возвращает nullable булево значение.

fun ten(strN: String?, intN: Int?): Boolean? {
    return null
}


//Задачи на написание кода

//Напишите валидную сигнатуру метода, а так же рабочий код для задач.

// Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(i: Int): Int {
    return i * 2
}

// Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

fun isEven(num: Int): Boolean = num % 2 == 0

// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        print("$i ")
    }
    println()
}

// Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(intList: List<Int>): Int? {
    for (anInt in intList) {
        if (anInt < 0) {
            return anInt
        }
    }
    return null
}
// Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(strList: List<Int?>) {
    for (str in strList) {
        if (str == null) {
            return
        }
        println(str)
    }
}


//MAIN

fun main(){
    println(multiplyByTwo(2))
    println(isEven(3))
    println(isEven(4))
    printNumbersUntil(5)
    println(findFirstNegative(listOf(1, 2, 3, 4, -5, 6)))
    processList(listOf(1, 2, 3, 4, null, 5))
}

