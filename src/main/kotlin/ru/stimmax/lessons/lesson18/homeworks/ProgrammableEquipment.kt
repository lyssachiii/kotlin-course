package ru.stimmax.ru.stimmax.lessons.lesson18.homeworks

abstract class ProgrammableEquipment : PowerableEquipment(), Programmable {
    protected var currentProgram = ""

    override fun programAction(action: String) {
        if (isPoweredOn) {
            currentProgram = action
            println("Program set to: $action")
        } else {
            println("Cannot program - device is off")
        }
    }

    override fun execute() {
        if (isPoweredOn && currentProgram.isNotEmpty()) {
            println("Executing program: $currentProgram")
        } else {
            println("Cannot execute - check power and program")
        }
    }
}

