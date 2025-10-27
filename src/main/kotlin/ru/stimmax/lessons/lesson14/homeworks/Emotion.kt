package ru.stimmax.ru.stimmax.lessons.lesson14.homework

// Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type (String) и intensity (Int). Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.

class Emotion(val type: String, var intensity: Int) {

    fun express() {
        println("Emotion: $type, Intensity: $intensity")
    }
}