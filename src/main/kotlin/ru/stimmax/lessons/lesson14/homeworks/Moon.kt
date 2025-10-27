package ru.stimmax.ru.stimmax.lessons.lesson14.homeworks

// Природное явление: луна. Создайте объект Moon, который будет представлять Луну. Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Waning Crescent"

    fun showPhase() {
        if (isVisible) {
            println("The moon is visible. Current phase: $phase")
        } else {
            println("The moon is not visible. Current phase: $phase")
        }
    }
}
