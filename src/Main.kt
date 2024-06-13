
fun main() {
    println("condicionales en Kotlin2")
    println("------------------------")
    println("Aqui empieza if")
    println(ift())
    println("------------------------")
    println("Aqui empieza when")
    println(whent())
    println("------------------------")
    println("Cómo escribir condiciones más complejas en una sentencia when")
    println(whent1())
    println("------------------------")
    println("Cómo usar una coma (,) para varias condiciones when")
    println(whent2())
    println("------------------------")
    println("Cómo usar la palabra clave in para un rango de condiciones when")
    println(whent3())
    println("------------------------")
    println("Cómo usar la palabra clave is para verificar el tipo de datos when")
    println(whent4())
    println("------------------------")
    println("Cómo agregar una condición adicional con el mismo cuerpo when")
    println(whent5())
    println("------------------------")
    println("Cómo convertir una sentencia if en una expresión")
    println(ift2())
    println("------------------------")
    println("Cómo convertir una sentencia when en una expresión")
    println(whent6())
    println("------------------------")
    println("------------------------")
    println(" Como usar la nulabilidad en Kotlin3")
    println("------------------------")
    println("Usa variables anulables")
    println(nulll())
    println("------------------------")
    println("Usa Escribe un valor Int anulable")
    println(nulll2())
    println("------------------------")
    println("Usa Escribe un valor Int anulable")
    println(nulll2())
    println("------------------------")
    println("Procesa variables anulables")
    println(anull())
    println("------------------------")
    println("Cómo acceder a una propiedad de una variable anulable")
    println(anull2())
    println("------------------------")
    println("Reasigna la variable favoriteActor a null")
    println(anull3())
    println("------------------------")
    println("Usa el operador de aserción no nulo de !!")
    println(Nanull())
    println("------------------------")
    println("Usa el operador de aserción no nulo de !! y genera error por null")
    println(Nanull())
    println("------------------------")
    println("Usa los condicionales if")
    println(iflelse())
    println("------------------------")
    println("Usa los condicionales if/else")
    println(iflelse2())
    println("------------------------")
    println("Expresiones if/else")
    println(iflelse3())
    println("------------------------")
    println("Usa el operador Elvis ?:")
    println(iflelse4())

}
    fun ift() {
        val trafficLightColor = "Black"
        if (trafficLightColor == "Red") {
            println("Stop")
        } else if (trafficLightColor == "Yellow") {
            println("Slow")
        } else if (trafficLightColor == "Green") {
            println("Go")
        } else {
            println("Invalid traffic-light color")
        }
    }
    fun ift2() {
            val trafficLightColor = "Black"

            val message =
                if (trafficLightColor == "Red") "Stop"
                else if (trafficLightColor == "Yellow") "Slow"
                else if (trafficLightColor == "Green") "Go"
                else "Invalid traffic-light color"
            println(message)

        }
    fun whent() {
        val trafficLightColor = "Yellow"
        when (trafficLightColor) {
            "Red" -> println("Stop")
            "Yellow" -> println("Slow")
            "Green" -> println("Go")
            else -> println("Invalid traffic-light color")
        }
    }
    fun whent1() {
        val x = 3
        when (x) {
            2 -> println("x is a prime number between 1 and 10.")
            3 -> println("x is a prime number between 1 and 10.")
            5 -> println("x is a prime number between 1 and 10.")
            7 -> println("x is a prime number between 1 and 10.")
            else -> println("x isn't a prime number between 1 and 10.")
        }
    }
    fun whent2() {
        val x = 3
        when (x) {
            2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
            else -> println("x isn't a prime number between 1 and 10.")
        }
    }
    fun whent3() {
        val x = 4

        when (x) {
            2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
            in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
            else -> println("x isn't a prime number between 1 and 10.")
        }
    }
    fun whent4() {
        val x: Any = 20
        when (x) {
            2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
            in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
            is Int -> println("x is an integer number, but not between 1 and 10.")
            else -> println("x isn't an integer number.")
        }
    }
    fun whent5() {
        val trafficLightColor = "Amber"

        when (trafficLightColor) {
            "Red" -> println("Stop")
            "Yellow", "Amber" -> println("Slow")
            "Green" -> println("Go")
            else -> println("Invalid traffic-light color")
        }
    }
    fun whent6() {
        val trafficLightColor = "Amber"

        val message = when(trafficLightColor) {
            "Red" -> "Stop"
            "Yellow", "Amber" -> "Proceed with caution."
            "Green" -> "Go"
            else -> "Invalid traffic-light color"
        }
        println(message)
    }
    fun nulll() {
        var favoriteActor: String? = "Sandra Oh"
        println(favoriteActor)

        favoriteActor = null
        println(favoriteActor)
    }
    fun nulll2() {
        var number: Int? = 10
        println(number)

        number = null
        println(number)
    }
    fun anull() {
        var favoriteActor: String = "Sandra Oh"
        println(favoriteActor.length)
    }
    fun anull2() {
        var favoriteActor: String? = "Sandra Oh"
        println(favoriteActor?.length)
    }
    fun anull3() {
        var favoriteActor: String? = null
        println(favoriteActor?.length)
    }

    fun Nanull() {
        var favoriteActor: String? = "Sandra Oh"
        println(favoriteActor!!.length)
    }
    fun Nanull2() {
        var favoriteActor: String? = null
        println(favoriteActor!!.length)
    }
    fun iflelse() {
        var favoriteActor: String? = "Sandra Oh"

        if (favoriteActor != null) {
            println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
        }
    }
    fun iflelse2() {
    var favoriteActor: String? = null

    if(favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }
}
    fun iflelse3() {
        val favoriteActor: String? = "Sandra Oh"

        val lengthOfName = if(favoriteActor != null) {
            favoriteActor.length
        } else {
            0
        }

        println("The number of characters in your favorite actor's name is $lengthOfName.")
    }
    fun iflelse4() {
        val favoriteActor: String? = "Sandra Oh"

        val lengthOfName = favoriteActor?.length ?: 0

        println("The number of characters in your favorite actor's name is $lengthOfName.")
    }