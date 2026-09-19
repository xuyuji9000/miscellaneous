// 1. If 

println("--- If ---")

var d: Int

val check = true

if (check) {
    d = 1
} else {
    d = 2
}

println(d)

// use if as an expression
val a = 1
val b = 2

println(if (a>b) a else b)

// 2. When

println("--- When ---")

val obj1 = "Hello"

when(obj1) {
    
    "1" -> println("one")
    
    "Hello" -> println("greeting")

    else -> println("unknown")
}

// use when as an expression
val obj2 = "Hello"

val result = when(obj2) {
    "1" -> "one"
    "Hello" -> "greeting"
    else -> "unknown"
}

println(result)

// when can be used without a subject
// to check a chain of boolean expressions
val trafficLightState = "Red"

val trafficAction = when {
    
    trafficLightState == "Green"  -> "Go"
    trafficLightState == "Yellow" -> "Slow down"
    trafficLightState == "Red"    -> "Stop"
    else                           -> "Malfunction"
}

println(trafficAction)

// 3. For

println("--- For ---")

for ( number in 1..5) {
    print(number)
}
println()

// collections can also be iterated over by loops
val cakes = listOf("carrot", "cheese", "chocolate")

for (cake in cakes) {
    println("Yummy, it's a $cake cake!")
}

// 4. While

println("--- While ---")

var cakesEaten = 0

while (cakesEaten < 3) {
    
    println("Eat a cake")

    cakesEaten++
}


// do-while
var cakesBaked = 0

do {
    println("Bake a cake")
    cakesBaked++  
} while (cakesBaked < cakesEaten)


