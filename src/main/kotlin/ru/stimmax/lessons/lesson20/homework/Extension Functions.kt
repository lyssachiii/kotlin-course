package ru.stimmax.ru.stimmax.lessons.lesson20.homework

// Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел - первое и последнее. Если массив был пуст то вернуть пару из null значений.

fun Array<out Number>.getFirstLast(): Pair<Number?, Number?> =
    if (isEmpty()) Pair(null, null) else Pair(first(), last())

// Создайте функцию-расширение для изменяемого списка элементов:
//
//     с дженериком T ограниченным интерфейсом Comparable<T>
//     которая принимает булево значение
//     возвращает этот же список только в виде неизменяемого
//     сам изменяемый список при этом должен стать отсортированным по возрастанию, если в функцию передано true и по убыванию, если false (используем функции sort() и sortDescending()

fun <T : Comparable<T>> MutableList<T>.sortAndFreeze(ascending: Boolean): List<T> {
    if (ascending) sort() else sortDescending()
    return toList()
}

// Создайте функцию-расширение для nullable словаря с дженериком:
//
//     Ключ является дженериком
//     Значение является списком из дженериков
//     Принимает целое число
//     Возвращает nullable словарь из ключей изначального словаря приведённых к строке через toString()
//     Значений из nullable дженерика, взятых из изначального ключа-списка по индексу из аргумента, если такого индекса нет - значением будет null

fun <K, V> Map<K, List<V>>?.getValuesByIndex(index: Int): Map<String, V?>? =
    this?.mapValues { (key, list) ->
        list.getOrNull(index)
    }?.mapKeys { it.key.toString() }


// Реализуйте метод расширения within для класса Number, который проверяет, что текущее число отклоняется от эталонного не более допустимого значения. Метод принимает два параметра: other — число для сравнения и deviation — максимально допустимое отклонение. Метод должен возвращать true, если разница между текущим числом и числом для сравнения не превышает заданное отклонение. Протестируйте функцию на разных типах чисел. Для получения отклонения, у разницы чисел нужно вызвать свойство absoluteValue.

fun Number.within(other: Number, deviation: Double): Boolean {
    val diff = this.toDouble() - other.toDouble()
    return (if (diff < 0) -diff else diff) <= deviation
}

// Реализуйте для класса String два метода расширения: encrypt и decrypt. Метод encrypt должен сдвигать каждый символ исходной строки на заданное число позиций вперед по таблице Unicode, а метод decrypt — на то же число позиций назад. Оба метода принимают один параметр base типа Int, который определяет величину сдвига. Протестируйте вашу реализацию, убедившись, что после шифрования и последующей расшифровки строка возвращается к исходному состоянию.
// Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием размера сдвига к char символу.

fun String.encrypt(base: Int): String =
    map { it + base }.joinToString("")

fun String.decrypt(base: Int): String =
    map { it - base }.joinToString("")

// Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы (но мы то знаем что слово только одно, но не будем его называть). Напиши метод расширения строки, который будет принимать список имён пользователей и выводить в консоли исходную строку побуквенно в верхнем регистре в столбик: имя автора и букву под ним.

//что-то муть кака-то в 6....

//Проверки

fun main() {
    println(arrayOf(1, 2, 3, 4, 5).getFirstLast())
    println(emptyArray<Number>().getFirstLast())

    val list = mutableListOf(3, 1, 2, 5, 4)
    println(list.sortAndFreeze(true))
    println(list)
    println(list.sortAndFreeze(false))
    println(list)

    val map = mapOf(
        "a" to listOf(1, 2, 3),
        "b" to listOf(4, 5, 6)
    )
    println(map.getValuesByIndex(1))
    println(map.getValuesByIndex(10))
    val nullMap: Map<String, List<Int>>? = null
    println(nullMap.getValuesByIndex(1))

    println(5.within(6, 1.5))
    println(5.within(7, 1.5))
    println(10.0.within(10.5, 0.6))

    val original = "Hi, how are you doing?"
    val encrypted = original.encrypt(3)
    val decrypted = encrypted.decrypt(3)
    println(original)
    println(encrypted)
    println(decrypted)
}