package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.container

class BottomMaterialContainer : Materials() {
    fun addToBottom(material: String) {
        val current = extractMaterials()
        addMaterial(material)
        current.forEach { addMaterial(it) }
    }
}