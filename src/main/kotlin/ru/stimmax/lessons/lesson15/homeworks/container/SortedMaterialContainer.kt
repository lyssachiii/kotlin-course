package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.container

class SortedMaterialContainer : Materials() {
    fun addSorted(material: String) {
        val current = extractMaterials()
        val newList = current + material
        newList.sorted().forEach { addMaterial(it) }
    }
}