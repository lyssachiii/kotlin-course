package ru.stimmax.ru.stimmax.lessons.lesson14.homeworks

import ru.stimmax.ru.stimmax.lessons.lesson14.homeworks.Shelf

class Rack(val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves || shelves.contains(shelf)) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index < 0 || index >= shelves.size) {
            return emptyList()
        }
        val removedItems = shelves[index].getItems()
        shelves.removeAt(index)
        return removedItems
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        shelves.forEachIndexed { index, shelf ->
            println("Shelf $index: Capacity ${shelf.capacity}, " +
                    "Remaining: ${shelf.getRemainingCapacity()}, " +
                    "Items: ${shelf.getItems()}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index < 0 || index >= shelves.size) {
            return emptyList()
        }

        val shelfToRemove = shelves[index]
        val itemsToRedistribute = shelfToRemove.getItems().sortedByDescending { it.length }
        val failedItems = mutableListOf<String>()

        for (item in itemsToRedistribute) {
            var placed = false
            for (i in shelves.indices) {
                if (i != index && shelves[i].canAccommodate(item)) {
                    shelves[i].addItem(item)
                    placed = true
                    break
                }
            }
            if (!placed) {
                failedItems.add(item)
            }
        }

        shelves.removeAt(index)
        return failedItems
    }
}