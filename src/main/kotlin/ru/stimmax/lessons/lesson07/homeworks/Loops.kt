package ru.stimmax.ru.stimmax.lessons.lesson07.homeworks


//Задания для цикла for

//Прямой диапазон

//Напишите цикл for, который выводит числа от 1 до 5.
fun main() {
    for (i in 1..5) {
        println(i)
    }
    println()

// Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 2..10) {
        if (i % 2 == 0)
            println(i)
    }
    println()

//Обратный диапазон

//Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) {
        println(i)
    }
    println()

//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    println()

//С шагом (step)

//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) {
        println(i)
    }
    println()

//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3) {
        println(i)
    }

//Использование до (until)

//Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size = 33
    for (i in 3 until size) {
        println(i)
    }
    println()


//Задания для цикла while

//Цикл while

//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var counter = 0
    while (counter++ < 5) {
        println(counter * counter)
    }
    println()

//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var counter1 = 10
    while (counter1-- > 5) {
        println(counter1)
    }
    println()

//Цикл do while

//Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var counter2 = 5
    do {
        println(counter2)
    } while (counter2-- > 1)
    println()

//Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter3 = 5
    do {
        println(counter3)
    } while (counter3++ < 10)
    println()

//Задания для прерывания и пропуска итерации
//Использование break

//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
    println()

//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var inf = 1
    while (inf >= 1) {
        println(inf)

        if (inf>=10) {
            break
        }
        inf++
    }
    println()

//Использование continue

//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
    println()

//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

    for (i in 1..10) {
        if (i % 3 == 0) continue
        println(i)
    }

}
