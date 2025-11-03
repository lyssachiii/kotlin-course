package ru.stimmax.ru.stimmax.lessons.lesson16.homeworks

open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        printColored("Bark", Colors.YELLOW)
    }
}

class Cat : Animal() {
    override fun makeSound() {
        printColored("Meow", Colors.PURPLE)
    }
}

class Bird : Animal() {
    override fun makeSound() {
        printColored("Tweet", Colors.CYAN)
    }
}

fun main() {
    val animals: List<Animal> = listOf(
        Dog(),
        Cat(),
        Bird(),
        Animal()
    )

    animals.forEach { it.makeSound() }
}