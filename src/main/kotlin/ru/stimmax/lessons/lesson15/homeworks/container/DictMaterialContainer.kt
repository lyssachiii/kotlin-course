package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.container

class DictMaterialContainer : Materials() {
    fun addDictionary(dict: Map<String, String>) {
        val current = extractMaterials()
        val keys = dict.keys.reversed()
        val values = dict.values

        keys.forEach { addMaterial(it) }
        current.forEach { addMaterial(it) }
        values.forEach { addMaterial(it) }
    }
}