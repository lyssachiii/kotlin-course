package ru.stimmax.ru.stimmax.lessons.lesson16.homeworks

abstract class Printer {
    abstract fun print(text: String)
}

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        words.forEach { word ->
            printColoredInline("$word ", Colors.BLACK, Background.WHITE)
        }
        println()
    }
}

class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        Colors.RED to Background.CYAN,
        Colors.GREEN to Background.YELLOW,
        Colors.BLUE to Background.WHITE,
        Colors.YELLOW to Background.BLUE,
        Colors.PURPLE to Background.GREEN
    )

    override fun print(text: String) {
        val words = text.split(" ")
        words.forEachIndexed { index, word ->
            val (color, bg) = colorPairs[index % colorPairs.size]
            printColoredInline("$word ", color, bg)
        }
        println()
    }
}

fun main() {
    val laser = LaserPrinter()
    val inkjet = InkjetPrinter()

    laser.print("Hello this is laser printer text")

    inkjet.print("Hello this is colorful inkjet printer text and it's long cuz we need to test all the colors yeahhhhh")
}