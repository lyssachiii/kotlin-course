package ru.stimmax.ru.stimmax.lessons.lesson19.homework

// Требуется описать класс, интерфейс или функцию и реализовать предложенную логику в коде.

//     Напиши функцию getMiddleElement с дженериком, которая будет принимать список и возвращать средний элемент, если он существует, иначе возвращать null. Например, у списка из четырёх элементов - среднего элемента нет.

fun <E> getMiddleElement(list: List<E>): E? {
    if (list.size % 2 == 1) return list[list.size / 2]
    return null
}

//     Напиши класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления нового элемента и получения всех элементов в виде неизменяемого списка.

class ListHolder<T> {
    private val list = mutableListOf<T>()

    fun add(item: T) = list.add(item)
    fun getItems(): List<T> = list.toList()
}

//     Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//         элементов одного типа в элементы другого типа
//         списка элементов одного типа в список элементов другого типа

interface Mapper<IN, OUT> {
    fun map(item: IN): OUT
    fun mapList(items: List<IN>): List<OUT>
}

//     Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>. Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов. Метод преобразования списков с аналогичной механикой.

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(item: String): List<String> = item.split(" ")
    override fun mapList(items: List<String>): List<List<String>> = items.map { it.split(" ") }
}

//     Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь, в котором ключ и значения поменялись местами.

fun <K, V> transposition(map: Map<K, V>): Map<V, K> = map.entries.associate { it.value to it.key }

//     Напиши интерфейс Validator с дженериком с функцией валидации, которая будет принимать элемент с типом дженерика и возвращать булево значение.

interface Validator<T> {
    fun validate(item: T): Boolean
}

//     Создай класс StringValidator и имплементируй интерфейс Validator с типом String?. Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.

class StringValidator : Validator<String?> {
    override fun validate(item: String?): Boolean =
        item != null && item.isNotBlank()
}

//     Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int. Реализуй проверку, что число чётное.

class OddValidator : Validator<Int> {
    override fun validate(item: Int): Boolean = item % 2 == 0
}

//     Создай класс ListValidator с дженериком, ограниченным типом Number, имплементируй интерфейс Validator типизированный по типу List с nullable типом дженерика класса
//         Реализуй проверку:
//             Ни один элемент списка не является null
//             Ни один элемент приведённый к типу Double не равен 0.0


class ListValidator<T : Number> : Validator<List<T?>> {
    override fun validate(items: List<T?>): Boolean =
        items.all { it != null && it.toDouble() != 0.0 }
}

// Проверки

fun main() {
    println(getMiddleElement(listOf("a", "b", "c", "d", "e")))
    println(getMiddleElement(listOf(1, 2, 3, 4)))

    val holder = ListHolder<String>()
    holder.add("a")
    holder.add("b")
    println(holder.getItems())

    val mapper = PhrasesToListOfStrings()
    println(mapper.map("hello world"))
    println(mapper.mapList(listOf("a b", "c d")))

    val map = mapOf("a" to 1, "b" to 2)
    println(transposition(map))

    val strValidator = StringValidator()
    println(strValidator.validate("hello"))
    println(strValidator.validate("   "))
    println(strValidator.validate(null))
    println(strValidator.validate(""))

    val oddValidator = OddValidator()
    println(oddValidator.validate(4))
    println(oddValidator.validate(3))

    val listValidator = ListValidator<Int>()
    println(listValidator.validate(listOf(1, 2, 3)))
    println(listValidator.validate(listOf(1, null, 3)))
    println(listValidator.validate(listOf(1, 0, 3)))
}