package ru.stimmax.ru.stimmax.lessons.lesson10.homework

fun main() {

//Задачи на работу со словарём

// Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val emptyMap = mapOf<Int, Int>()

// Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

    val someMap = mapOf<Float, Double>(1.10000000f to 1.22222222, 2.55f to 2.01114, 7.00017f to 4.289467)

// Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val mutMap = mutableMapOf<Int, String>()

// Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    mutMap[1] = "A"
    mutMap[2] = "B"
    mutMap[3] = "C"

// Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.

    val letter1 = mutMap[1]
    println(letter1)

    val letter4 = mutMap[4]
    println(letter4)

// Удалите определенный элемент из изменяемого словаря по его ключу.

    mutMap.remove(3)

// Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово "бесконечность")

    val doubleIntMap = mapOf<Double, Int>(1.11 to 2, 2.22 to 0, 3.33 to 4, 5.555 to 6)
    for ((d, i) in doubleIntMap) {
        if (i == 0) {
            println("бесконечность")
        } else {
            println(d / i)
        }
    }

// Измените значение для существующего ключа в изменяемом словаре.

    mutMap[1] = "Z"
    println(mutMap[1])

// Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

    val map1 = mapOf(1 to 111, 2 to 222, 3 to 333)
    val map2 = mapOf(4 to 444, 5 to 555, 6 to 666)
    val map3 = mutableMapOf<Int, Int>()

    for ((key, value) in map1) {
        map3[key] = value
    }

    for ((key, value) in map2) {
        map3[key] = value
    }

    println(map3)


// Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.

    val listyMap = mutableMapOf<String, List<Int>>()

    listyMap["num1"] = listOf(1, 2, 3, 4, 5)
    listyMap["num2"] = listOf(10, 20, 30)

// Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.

    val mutSetMap = mutableMapOf<Int, MutableSet<String>>()

    mutSetMap[1] = mutableSetOf("apple", "banana")
    mutSetMap[2] = mutableSetOf("cat", "dog")
    mutSetMap[3] = mutableSetOf("red", "blue", "green")

    mutSetMap[1]?.add("orange")
    mutSetMap[2]?.addAll(setOf("elephant", "fish"))

    val setForKey1 = mutSetMap[1]
    println(setForKey1)

    setForKey1?.add("grape")

    println(setForKey1)
    println(mutSetMap)

// Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val map5 = mapOf(Pair(1, 5) to "One",
        Pair(2, 3) to "Two",
        Pair(5, 3) to "Three",
        Pair(4, 8) to "Four",
        Pair(5, 0) to "Five")

    for ((k, v) in map5) {
        val (a, b) = k
        if (a == 5 || b == 5) {
            println(v)
        }
    }

//Задачи на подбор оптимального типа для словаря

// Словарь библиотека: Ключи - автор книги, значения - список книг

    val library = mutableMapOf<String, MutableList<String>>()

// Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

    val plants = mapOf<String, List<String>>()

// Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val teams = mutableMapOf<String, MutableList<String>>()

// Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату

    val therapy = mutableMapOf<String, MutableList<String>>()

// Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.

    val travel = mutableMapOf<String, MutableMap<String, MutableList<String>>>()

}