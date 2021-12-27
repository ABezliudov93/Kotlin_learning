open class Animals {
    open val image = ""
    open val food = ""
    open val habitat = ""
    open var hunger = 10

    open fun makeNoise() {
        println("The Animal is making a nois")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }

}