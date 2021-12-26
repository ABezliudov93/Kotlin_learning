
fun main (args: Array<String>) {
    buildAquarium()
    makeFish()
    //infoSpice()
}

fun buildAquarium() {

    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height} ")

    myAquarium.height = 80

    println("Heigth: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width =  15, height =  30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    var myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
            "length ${myAquarium2.length} " +
            "width ${myAquarium2.width} " +
            "height ${myAquarium2.height} ")
}

fun infoSpice() {

    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}




/*val spices1 = listOf(
    Spice("curry", "mild"),
    Spice("pepper", "medium"),
    Spice("cayenne", "spicy"),
    Spice("ginger", "mild"),
    Spice("red curry", "medium"),
    Spice("green curry", "mild"),
    Spice("hot pepper", "extremely spicy")
)*/

//val spice = Spice("cayenne", spiciness = "spicy")

//val spicelist = spices1.filter {it.heat < 5}

//fun makeSalt() = Spice("Salt")