package ru.stimmax.ru.stimmax.lessons.lesson14.homeworks

class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    fun addItem(item: String): Boolean {
        if (canAccommodate(item)) {
            items.add(item)
            return true
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        return items.remove(item)
    }

    fun canAccommodate(item: String): Boolean {
        val currentUsage = items.sumOf { it.length }
        return currentUsage + item.length <= capacity
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun getRemainingCapacity(): Int {
        val currentUsage = items.sumOf { it.length }
        return capacity - currentUsage
    }
}