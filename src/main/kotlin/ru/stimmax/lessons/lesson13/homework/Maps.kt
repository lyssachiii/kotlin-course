package ru.stimmax.ru.stimmax.lessons.lesson13.homework

fun main() {

//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.

//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
fun avgTestTime (testTime: Map<String, Double>): Double {
    return testTime.values.average()
}
    val res1 = avgTestTime(mapOf(
        "test1" to 3.1,
        "test2" to 7.76,
        "test3" to 6.8
    ))
    println(res1)

//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.

fun getTestMethods(metadata: Map<String, String>): List<String> {
    return metadata.keys.toList()
}

    val meta = mapOf(
        "testLogin" to "auth",
        "testPay" to "payment",
        "testSearch" to "search"
    )

    println(getTestMethods(meta))

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

val testResults = mutableMapOf(
    "Тест 1" to "Pass",
    "Тест 2" to "Fail"
)

    testResults["Тест 3"] = "Pass"
    println(testResults)

//Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val testResults1 = mapOf(
        "Test 1" to "passed",
        "Test 2" to "failed",
        "Test 3" to "passed",
        "Test 4" to "skipped"
    )

    val passedCount = testResults1.values.count { it == "passed" }
    println(passedCount)

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val bugTracker = mutableMapOf(
        "Login button not working" to "fixed",
        "Crash on startup" to "in progress",
        "Infinite loading time" to "open"
    )

    bugTracker.remove("Login button not working")

    println(bugTracker)

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
fun printStatus(results: Map<String, Int>) = results.forEach { (url, status) -> println("$url - $status") }

    val testData = mapOf(
        "https://site.com" to 200,
        "https://api.site.com" to 404,
        "https://admin.site.com" to 500
    )
    printStatus(testData)

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val responseTimes = mapOf(
        "AuthService" to 120,
        "PaymentService" to 350,
        "UserService" to 90,
        "NotificationService" to 480
    )
    val threshold = 150

    val slowServices = responseTimes.filter { it.value > threshold }
    println(slowServices)

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val apiResults = mapOf(
        "/login" to "200 OK",
        "/register" to "201 Created",
        "/logout" to "404 Not Found"
    )

    val endpoint = "/profile"
    val status = apiResults.getOrElse(endpoint) { "Not tested" }

    println("Endpoint: $endpoint — Status: $status")

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
fun getBrowserType(config: Map<String, String>) =
    config.getValue("browserType")

    val testConfig = mapOf(
        "browserType" to "chrome",
        "timeout" to "30",
        "baseUrl" to "https://test.com"
    )
    println(getBrowserType(testConfig))

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val versions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val newVersions = versions + ("v2.0" to "alpha")
    println(newVersions)

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    fun getSettings(devices: Map<String, String>, model: String) =
        devices.getOrDefault(model, "default_settings")

    val deviceSettings = mapOf(
        "iPhone15" to "ios_settings",
        "SamsungS24" to "android_settings",
        "OnePlus13" to "android_settings"
    )
    println(getSettings(deviceSettings, "iPhone15"))
    println(getSettings(deviceSettings, "Xiaomi"))

//Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
fun hasError(errors: Map<String, String>, code: String) =
    errors.containsKey(code)
    val testErrors = mapOf(
        "ERR_001" to "Timeout",
        "ERR_002" to "Memory leak",
        "ERR_003" to "Network error"
    )
    println(hasError(testErrors, "ERR_001"))
    println(hasError(testErrors, "ERR_404"))

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
fun filterByVersion(tests: Map<String, String>, version: String) =
    tests.filterKeys { it.contains(version) }

    val testScenarios = mapOf(
        "Login_v1.2" to "Passed",
        "Payment_v1.1" to "Failed",
        "Search_v1.2" to "Passed",
        "Auth_v1.3" to "Skipped"
    )
    println(filterByVersion(testScenarios, "v1.2"))

//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val testResults4 = mapOf(
        "AuthModule" to "passed",
        "PaymentModule" to "failed",
        "UIModule" to "passed"
    )

    val hasFailed = testResults4.containsValue("failed")

    if (hasFailed) {
        println("Some modules failed testing.")
    } else {
        println("All modules passed testing.")
    }

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val mainConfig = mutableMapOf(
        "browser" to "Chrome",
        "timeout" to "30s"
    )

    val additionalConfig = mapOf(
        "environment" to "Staging",
        "resolution" to "1920x1080"
    )

    mainConfig.putAll(additionalConfig)

    println(mainConfig)

//Объедините два неизменяемых словаря с данными о багах.
    val bugs1 = mapOf("B001" to "UI bug", "B002" to "Crash")
    val bugs2 = mapOf("B003" to "Performance", "B004" to "Memory leak")
    val allBugs = bugs1 + bugs2
    println(allBugs)

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    fun clearTempData(data: MutableMap<String, Any>) = data.clear()
    val tempData = mutableMapOf(

        "runId" to 123,
        "timestamp" to "2024-01-01",
        "results" to listOf("passed", "failed")
    )
    clearTempData(tempData)
    println(tempData)

    //Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
fun filterSkipped(results: Map<String, String>) =
    results.filterValues { it != "skipped" }

    val testResults3 = mapOf(
        "testLogin" to "passed",
        "testPay" to "failed",
        "testSearch" to "skipped",
        "testAuth" to "skipped"
    )
    println(filterSkipped(testResults3))

//Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
val config = mapOf(
    "browser" to "chrome",
    "timeout" to "30",
    "retries" to "3",
    "headless" to "true"
)
val newConfig = config - listOf("retries", "headless")
println(newConfig)

//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".

fun createReport(results: Map<String, String>) =
    results.map { (id, res) -> "Test $id: $res" }

val testResults2 = mapOf(
    "T001" to "Passed",
    "T002" to "Failed",
    "T003" to "Skipped"
)
println(createReport(testResults2))

//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

//Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).

//Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.

//Проверьте, пуст ли словарь с ошибками компиляции тестов.

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.

}