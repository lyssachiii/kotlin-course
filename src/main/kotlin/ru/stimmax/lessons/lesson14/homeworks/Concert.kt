package ru.stimmax.ru.stimmax.lessons.lesson14.homeworks

class Concert(val band: String, val venue: String, val price: Int, val capacity: Int) {
    private var soldTickets = 0

    fun info() {
        println("Band performing: $band, Venue: $venue, Price for 1 ticket: $price, Вместимость: $capacity, Продано: $soldTickets")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("Thank you for your purchase!")
        } else {
            println("No more tickets left")
        }
    }
}