package ru.stimmax.ru.stimmax.lessons.lesson16.homeworks

abstract class Shape {
    open fun area(): Double = 0.0
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(6.0, 3.0),
    )

    shapes.forEachIndexed { index, shape ->
        println("Shape $index area: ${shape.area()}")
    }
}