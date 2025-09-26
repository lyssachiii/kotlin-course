package ru.stimmax.ru.stimmax.lessons.lesson07.homeworks

//Используя вложенный цикл реализовать таблицу умножения, как на картинке.
fun table() {
    for (r in 1..10) {
        for (c in 1..10) {
            print("${r * c}\t")
        }
        println()
    }
}

//Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun argSum(arg: Int): Int {
    var sum = 0
    for (i in 1..arg) {
        sum += i
    }
    return sum
}

//Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun factorial(arg: Int): Long {
    var res = 1L
    var i = 1
    while (i <= arg) {
        res *= i
        i++
    }
    return res
}


//Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun argSum2 (arg: Int): Int {
    var sum = 0
    var count = 2
    while (count <= arg) {
        sum += count
        count+=2
    }
    return (sum)

}

//Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
fun asterisks () {
    var r = 1
    while (r <= 3) {
        var c = 1
        while (c <= 5) {
            print("*")
            c++
        }
        println()
        r++
    }
}
//Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun unEven(arg: Int) {
    var unSum = 0
    var evenSum = 0
    for (i in 1..arg) {
        if (i % 2 == 0) {
            evenSum += i
        } else {
            unSum += i
        }
    }
    print(unSum)
    print(" ")
    print(evenSum)
}

//Main
fun main() {
    table()
    println()
    println(argSum(15))
    println()
    println(factorial(20))
    println()
    println(argSum2(13))
    println()
    asterisks()
    println()
    unEven(11)
}