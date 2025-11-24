package ru.stimmax.ru.stimmax.lessons.lesson22.homework

// Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//
//     NullPointerException
//     IndexOutOfBoundsException
//     ClassCastException
//     IllegalArgumentException
//     NumberFormatException
//     IllegalStateException
//     OutOfMemoryError
//     StackOverflowError
//
// Задание 9. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок

fun testExceptions() {
    try {
        val str: String? = null
        str!!.length
    } catch (e: NullPointerException) {
        println("Пойман NullPointerException")
    }

    try {
        val list = listOf(1, 2, 3)
        list[5]
    } catch (e: IndexOutOfBoundsException) {
        println("Пойман IndexOutOfBoundsException")
    }

    try {
        val obj: Any = "hello"
        val num = obj as Int
    } catch (e: ClassCastException) {
        println("Пойман ClassCastException")
    }

    try {
        fun setAge(age: Int) {
            if (age < 0) throw IllegalArgumentException()
        }
        setAge(-5)
    } catch (e: IllegalArgumentException) {
        println("Пойман IllegalArgumentException")
    }

    try {
        "abc".toInt()
    } catch (e: NumberFormatException) {
        println("Пойман NumberFormatException")
    }

    try {
        val state = false
        check(state)
    } catch (e: IllegalStateException) {
        println("Пойман IllegalStateException")
    }

    try {
        val bigArray = Array(1000000000) { it }
    } catch (e: OutOfMemoryError) {
        println("Пойман OutOfMemoryError")
    }

    try {
        fun recursive(): Nothing = recursive()
        recursive()
    } catch (e: StackOverflowError) {
        println("Пойман StackOverflowError")
    }
}

// Задание 10. Напиши функцию, которая принимает nullable аргумент типа Any и в блоке try/catch выполни набор действий с этим аргументом которые могут потенциально вызвать одно из исключений в этом же порядке:
// В блоке catch перехватывай исключение с общим типом Throwable а внутри через when определи тип исключения и выведи сообщение с названием исключения. Сразу после when выброси перехваченное исключение через throw, чтобы прекратить работу программы. Если аргумент функции не вызвал исключение, то выведи текст, сообщающий что переданный аргумент фантастически хорош!

fun testAllExceptions(arg: Any?) {
    try {
        // NullPointerException
        arg!!.toString()

        // IndexOutOfBoundsException
        val list = listOf(1, 2, 3)
        list[arg.toString().toInt()]

        // ClassCastException
        val str = arg as String
        val num = str as Int

        // IllegalArgumentException
        if (arg.toString().length < 0) throw IllegalArgumentException()

        // NumberFormatException
        "abc".toInt()

        // IllegalStateException
        check(false)

        println("Переданный аргумент фантастически хорош!")

    } catch (e: Throwable) {
        when (e) {
            is NullPointerException -> println("NullPointerException")
            is IndexOutOfBoundsException -> println("IndexOutOfBoundsException")
            is ClassCastException -> println("ClassCastException")
            is IllegalArgumentException -> println("IllegalArgumentException")
            is NumberFormatException -> println("NumberFormatException")
            is IllegalStateException -> println("IllegalStateException")
            else -> println("Другое исключение: ${e.javaClass.simpleName}")
        }
        throw e
    }
}


fun main() {

   testExceptions()

    testAllExceptions(null)
}