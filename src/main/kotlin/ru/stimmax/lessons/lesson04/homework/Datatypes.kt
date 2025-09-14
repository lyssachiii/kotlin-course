package ru.stimmax.ru.stimmax.lessons.lesson04.homework

class Datatypes {
    val v1: Byte = 42
    val v2: Long = 98765432123456789L
    val v3: Float = 23.45f
    val v4: Double = 0.123456789
    val v5: String = "Kotlin & Java"
    // должно быть false
    // val v6 = FALSE
    val v7: Char = 'c'
    val v8: Short = 500
    val v9: Long = 4294967296L
    val v10: Float = 18.0f
    val v11: Double = -0.001
    val v12: String = "OpenAI"
    // v13 вполне себе String, но он как будто байтит на исправление на Boolean))
    val v13: String = "true"
    val v14: List<Int> = listOf(3, 14)
    val v15: Char = '9'
    val v16: Short = 2048
    val v17: Long = 10000000000L
    val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
    val v19: Float = 5.75f
    // неверные или лишнее кавычки; должны быть либо "" у типа String, либо никаких у типа Double
    //val v20 = `1.414`
    val v21: String = "Artificial Intelligence"
    // массив не может содержать элементы разных типов - тут должны быть оба Char (ну или String)
    //val v22: Array<Char> = arrayOf('x', "A")
    val v23: String = "Android Studio"
    val v24: Char = '@'
    val v25: Short = 1024
    val v26: Long = 1234567890123L
    val v27: Float = 10.01f
    val v28: Double = -273.15
    val v29: String = "SpaceX"
    // должно быть false
    //val v30: Boolean = FALSE
    val v31: Double = 0.007
    // неправильные кавычки, должны быть ""
    // val v32: String = “🤯”
    // ну вот опять String, косящий под Boolean))
    val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)
    // кавычки не нужны
    // val v34: Int = ‘65535’
    val v35: Long = 72057594037927935L
    val v36: Float = 2.71828f
    val v37: Double = 101.0101
    val v38: String = "Quantum Computing"
    val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
    val v40: Char = 'x'
    val v41: Short = 314
    val v42: Long = 123456789123456789L
    val v43: Float = 6.626f
    // нужно true
    //val v44: Boolean = TRUE
}
