package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.EducationalInstitutions

class University(name: String, students: Int, val faculties: Int) : EducationalInstitution(name, students) {
    val level = "University"
}