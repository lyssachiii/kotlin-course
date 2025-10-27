package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.container

class InterleavedMaterialContainer : Materials() {
    fun addInterleaved(newMaterials: List<String>) {
        val current = extractMaterials()
        val result = mutableListOf<String>()

        val maxSize = maxOf(newMaterials.size, current.size)
        for (i in 0 until maxSize) {
            if (i < newMaterials.size) result.add(newMaterials[i])
            if (i < current.size) result.add(current[i])
        }

        result.forEach { addMaterial(it) }
    }
}