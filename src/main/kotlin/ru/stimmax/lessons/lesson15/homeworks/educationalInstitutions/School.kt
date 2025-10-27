package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.EducationalInstitutions

class School(name: String, students: Int, val classes: Int) : EducationalInstitution(name, students) {
    val level = "School"
}