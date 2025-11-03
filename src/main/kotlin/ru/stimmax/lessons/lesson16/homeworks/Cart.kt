package ru.stimmax.ru.stimmax.lessons.lesson16.homeworks

class ShoppingCart {
    private val items = mutableMapOf<String, Int>()

    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(newItems: Map<String, Int>) {
        newItems.forEach { (itemId, amount) ->
            items[itemId] = items.getOrDefault(itemId, 0) + amount
        }
    }

    fun addToCart(itemIds: List<String>) {
        itemIds.forEach { addToCart(it) }
    }

    override fun toString(): String {
        val total = items.values.sum()
        return "Items: $items, Total: $total"
    }
}

fun main() {
    val cart = ShoppingCart()

    cart.addToCart("A001")
    cart.addToCart("B002", 3)
    cart.addToCart(listOf("C003", "C003", "D004"))
    cart.addToCart(mapOf("E005" to 2, "F006" to 1))

    println(cart)
}