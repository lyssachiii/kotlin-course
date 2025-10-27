package ru.stimmax.ru.stimmax.lessons.lesson15.homeworks.EducationalInstitutions

class College(name: String, students: Int, val programs: Int) : EducationalInstitution(name, students) {
    val level = "College"
}