import java.util.*

class Dog(val name: String, var weight: Int, breed_param: String) {
     var activities = arrayOf("Walks")
     val breed = breed_param.uppercase(Locale.getDefault())
     val weightInKgs: Double
         get() = weight / 2.2
 }