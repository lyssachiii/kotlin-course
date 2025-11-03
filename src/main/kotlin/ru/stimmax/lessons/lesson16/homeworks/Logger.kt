package ru.stimmax.ru.stimmax.lessons.lesson16.homeworks

class Logger {

    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(level: String, message: String) {
        when (level) {
            "WARNING" -> printColored("WARNING: $message", Colors.YELLOW)
            "ERROR" -> printColored("ERROR: $message", Colors.WHITE, Background.RED)
            else -> println("$level: $message")
        }
    }

    fun log(messages: List<String>) {
        messages.forEach { log(it) }
    }

    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Unknown error")
    }
}

fun main() {
    val logger = Logger()

    logger.log("Application started")
    logger.log("WARNING", "Low memory")
    logger.log("ERROR", "Database connection failed")
    logger.log(listOf("Message 1", "Message 2", "Message 3"))
    logger.log(Exception("File not found"))
}