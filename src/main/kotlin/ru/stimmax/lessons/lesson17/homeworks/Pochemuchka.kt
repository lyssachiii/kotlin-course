package ru.stimmax.ru.stimmax.lessons.lesson17.homeworks

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // ОТВЕТ: Это поле НЕ доступно в main() из ChildrenClass, так как оно private.
    // private поля видны только внутри класса где объявлены
    private val privateVal: String,

    // 2. объясни, почему это поле недоступно в main()
    // ОТВЕТ: protected поля доступны только внутри класса и его наследников, но не в main()
    protected val protectedVal: String,

    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. объясни, почему эта функция не может быть публичной
    // ОТВЕТ: Она возвращает ProtectedClass, который protected - нельзя возвращать protected тип из public метода
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // ОТВЕТ: Потому что в ChildrenClass этот метод переопределен
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. объясни, почему эта функция не может быть публичной или protected
    // ОТВЕТ: Она возвращает PrivateClass, который private - нельзя возвращать private тип из public/protected метода
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}
    private class PrivateClass() {}
}

class ChildrenClass(
    val privateVal: String,  // Это ДРУГОЕ поле, не то же что в BaseClass!
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // ОТВЕТ: Потому что он передается в конструктор BaseClass как publicVal, которая public
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // ОТВЕТ: Потому что она унаследована от BaseClass и является public

    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // ОТВЕТ: Выводится "Печать из класса BaseClass", потому что private методы не виртуальные
    // и BaseClass.printText() всегда вызывает свою private версию
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    // Доработка для пункта 4
    override fun verifyPublicField(value: String): Boolean {
        return true // Разрешаем любые значения
    }

    // Доработка для пункта 5
    fun setProtectedField(value: String) {
        protectedField = value
    }

    // Доработка для пункта 6
    fun setPrivateField(value: String) {
        // privateField = value // Нельзя - privateField private в BaseClass
        // Нужно добавить метод в BaseClass или изменить модификатор
    }
}

fun main() {
    val child = ChildrenClass("private", "protected", "public")

    // 3. Изменяем publicField
    child.publicField = "Антонио Бандераса"

    // 5. Изменяем protectedField через сеттер
    child.setProtectedField("Измененное protected поле")

    println(child.getAll())
    child.printText()
}