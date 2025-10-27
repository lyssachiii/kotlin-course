package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.container

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }
    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

fun main() {

    val bottomContainer = BottomMaterialContainer()
    bottomContainer.addMaterial("existing")
    bottomContainer.addToBottom("new")
    bottomContainer.printContainer()
    println()

    val interleavedContainer = InterleavedMaterialContainer()
    interleavedContainer.addMaterial("a")
    interleavedContainer.addMaterial("b")
    interleavedContainer.addInterleaved(listOf("x", "y"))
    interleavedContainer.printContainer()
    println()

    val sortedContainer = SortedMaterialContainer()
    sortedContainer.addMaterial("beta")
    sortedContainer.addMaterial("alpha")
    sortedContainer.addSorted("gamma")
    sortedContainer.printContainer()
    println()

    val dictContainer = DictMaterialContainer()
    dictContainer.addMaterial("middle")
    dictContainer.addDictionary(mapOf("key1" to "val1", "key2" to "val2"))
    dictContainer.printContainer()
}