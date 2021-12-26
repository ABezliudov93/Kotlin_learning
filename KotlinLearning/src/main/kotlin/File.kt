import java.util.*
import kotlin.concurrent.fixedRateTimer

fun main(args: Array<String>) {
    println("Hello, !")
    feedTheFish()
}

fun shouldDirtySensorReading() = 20

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = shouldDirtySensorReading()) : Boolean {

    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater2(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : Boolean {
    return true
}


fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, 50)
    shouldChangeWater2(day = "Monday")

    if (shouldChangeWater(day)) {
        println("Change the water")
    }

}

fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String): String {
    var food = "fasting"

    return when (day) {
        "Monday"    -> "flakes"
        "Tuesday"   ->  "pellets"
        "Wednesday" ->  "redworms"
        "Thursday"  ->  "granules"
        "Friday"    ->  "mosquitoes"
        "Saturday"  ->  "lettuce"
        "Sunday"    ->  "plankton"
        else -> "fasting"
    }
}

////////////////////////////////////////////////////////////////

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")
    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}
