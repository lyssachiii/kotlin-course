package ru.stimmax.ru.stimmax.lessons.lesson14.homeworks

import ru.stimmax.ru.stimmax.lessons.lesson14.homeworks.Rack
import ru.stimmax.ru.stimmax.lessons.lesson14.homeworks.Shelf

fun main() {

    //1-5

    val party1 = Party("Подвал №1", 27)
    party1.details()

    val emotion1 = Emotion("Anger", 666)
    emotion1.express()

    Moon.showPhase()

    val product1 = Product("Ketchup", 100, 200)
    println(product1)

    val concert1 = Concert("LOONA", "Seoul World Cup Stadium", 12000, 10000)
    concert1.info()
    concert1.buyTicket()
    concert1.info()

    //6.1 Shelf

    val shelf = Shelf(20)
    println("Add 'book': ${shelf.addItem("book")}")
    println("Add 'pencil': ${shelf.addItem("pencil")}")
    println("Add 'verylongitemname': ${shelf.addItem("verylongitemname")}")
    println("Contains 'book': ${shelf.containsItem("book")}")
    println("Remove 'pencil': ${shelf.removeItem("pencil")}")
    println("Items: ${shelf.getItems()}")
    println()

    //6.2 Rack
    val rack = Rack(3)

    println("Add shelf1: ${rack.addShelf(Shelf(15))}")
    println("Add shelf2: ${rack.addShelf(Shelf(10))}")
    println("Add shelf3: ${rack.addShelf(Shelf(8))}")
    println("Add shelf4: ${rack.addShelf(Shelf(5))}")

    println("Add 'pen': ${rack.addItem("pen")}")
    println("Add 'notebook': ${rack.addItem("notebook")}")
    println("Add 'ruler': ${rack.addItem("ruler")}")
    println("Add 'verybigitem': ${rack.addItem("verybigitem")}")

    println("Contains 'pen': ${rack.containsItem("pen")}")
    println("Remove 'notebook': ${rack.removeItem("notebook")}")

    println("\nRack contents:")
    rack.printContents()
    println()

    println("=== Testing Advanced Removal ===")
    val rack2 = Rack(3)
    rack2.addShelf(Shelf(10))
    rack2.addShelf(Shelf(8))
    rack2.addShelf(Shelf(6))

    rack2.addItem("apple")
    rack2.addItem("banana")
    rack2.addItem("cherry")
    rack2.addItem("date")

    println("Before removal:")
    rack2.printContents()

    val failed = rack2.advancedRemoveShelf(1)
    println("\nAfter removing shelf 1:")
    rack2.printContents()
    println("Failed to place: $failed")
}




// Мероприятие: концерт. Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.


// Задание 6. Стеллаж и полки.

// Цель задания: Создать систему управления складским пространством с использованием классов "Стеллаж" и "Полка стеллажа".

// Класс Shelf (Полка Стеллажа)

// Характеристики:

//     Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//     Список предметов (items): хранит названия предметов на полке.

// Методы:

//     Добавление Предмета (addItem):
//         Принимает название предмета.
//         Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
//         Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.
//     Удаление Предмета (removeItem):
//         Принимает название предмета.
//         Удаляет предмет, если он найден на полке.
//         Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//     Проверка Вместимости (canAccommodate):
//         Принимает название предмета.
//         Определяет, вместится ли предмет на полку.
//         Возвращает true, если предмет вместится, и false, если места недостаточно.
//     Проверка наличия предмета (containsItem):
//         Принимает название предмета
//         Возвращает true если такой предмет есть
//     Получение списка предметов (getItems):
//         Возвращает неизменяемый список предметов

// Класс Rack (Стеллаж)

// Характеристики:

//     Список полок (shelves): хранит полки стеллажа.
//     Максимальное количество полок.

// Методы:

//     Добавление Полки (addShelf):
//         Добавляет новую полку в стеллаж.
//         Возвращает true, если полка была успешно добавлена или false если стеллаж уже заполнен или была попытка добавить полку которая уже установлена.
//     Удаление Полки (removeShelf):
//         Принимает индекс полки для удаления.
//         Удаляет полку по указанному индексу.
//         Возвращает список предметов полки, если полка была успешно удалена или пустой список если полка не существует.
//     Добавление Предмета (addItem):
//         Добавляет предмет на первую свободную полку.
//         Возвращает true, если предмет успешно добавлен, и false, если на всех полках недостаточно места.
//     Удаление Предмета (removeItem):
//         Находит и удаляет только один предмет с любой полки.
//         Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//     Проверка наличия предмета на стеллаже (containsItem):
//         Возвращает true если предмет есть на одной из полок
//     Получение списка полок (getShelves):
//         Возвращает неизменяемый список полок
//     Печать Содержимого (printContents):
//         Выводит в консоль информацию о каждой полке: индекс, вместимость, оставшуюся вместимость, список предметов. Информацию выводить в наглядном читаемом виде
//     Сложное удаление полки (advancedRemoveShelf):
//         Принимает индекс полки для удаления
//         Перераспределяет предметы по имеющимся полкам, начиная с самых длинных. Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
//         Удаляет полку с оставшимися предметами
//         Возвращает неизменяемый список предметов, которые не удалось удалить или пустой список если полки с таким индексом нет.