// 1. List

// Read only list
val readOnlyShapes = listOf("triangle", "square", "circle")
println(readOnlyShapes)


// Mutable list with explicat type declaration
val shapes1: MutableList<String> = mutableListOf("triangle", "square", "circle")
println(shapes1)

// casting
// create a read only view of a mutable list
val shapes2: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapes2Locked: List<String> = shapes2

// get the first element
println("the first item in the list is ${readOnlyShapes.first()}")

// get the number of items in a list
println("this list has ${readOnlyShapes.count()} items")

// to check that an item is in a list
println("circle" in readOnlyShapes)

// add and remove items from mutable list
shapes1.add("pentagon")
println(shapes1)
shapes1.remove("pentagon")
println(shapes1)

// 2. Set

// Read Only set
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
println(readOnlyFruit)

// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
println(fruit)

// add and remove items from mutable set
fruit.add("dragonfruit")
println(fruit)

fruit.remove("dragonfruit")
println(fruit)
    

// 3. Map

println("--- Map ---")

// readonly map
val readOnlyJuiceMenu = mapOf(
    "apple"  to 100,
    "kiwi"   to 190,
    "orange" to 100
)

println(readOnlyJuiceMenu)

// mutable map with explicit type declaration
val juiceMenu: MutableMap<String, Int> = mutableMapOf(
    "apple"  to 100,
    "kiwi"   to 190,
    "orange" to 100
)
println(juiceMenu)

// use 'indexed access operator' to access a value in a map
println("the value of the apple juice is ${juiceMenu["apple"]}")
println("the value of the pineapple juice is ${juiceMenu["pineapple"]}")

// use 'indexed access operator' to add items to a mutable map
juiceMenu["coconut"] = 150
println(juiceMenu)

// remove item from a mutable map
juiceMenu.remove("coconut")
println(juiceMenu)

// get the number of items in a map
println("this map has ${readOnlyJuiceMenu.count()} key-value pairs")

// check if a specific key already in a map
println(readOnlyJuiceMenu.containsKey("kiwi"))

// to obtain a collectiion of the keys or values from the map
println(readOnlyJuiceMenu.keys)
println(readOnlyJuiceMenu.values)

// to check a key or value in a map
println("orange" in readOnlyJuiceMenu.keys)
println("orange" in readOnlyJuiceMenu)
println(200 in readOnlyJuiceMenu.values)