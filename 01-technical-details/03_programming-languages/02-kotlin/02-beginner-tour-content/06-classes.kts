class Contact(
    val id   : Int,
    var email: String
) {
    fun printId() {
        println(id)
    }
}

// 1. Create instance
println("--- Create instance ---")
val contact = Contact(1, "mary@gmail.com")

// 2. access property
println("--- Access property ---")

println(contact.email)

contact.email = "jane@gmail.com"

println(contact.email)

// 3. member functions
println("--- Member functions ---")
contact.printId()


// 4. data class
println("--- Data class ---")

data class User(
    val name: String,
    val id  : Int
)

// 4.1 print as string
println("--- Print as string ---")
val user = User("Alex", 1)

// Automatically uses toString() function
// So that output is easy to read
println(user.toString())

// 4.2 compare instances
println("--- Compare instances ---")

val user1 = User("Alex", 1)
val user2 = User("Alex", 1)
val user3 = User("Max", 2)

println("user1 == user2: ${user1 == user2}") 
println("user2 == user3: ${user2 == user3}") 

// 4.3 copy instance
println("--- Copy instance ---")
val user4 = User("Alex", 1)


println(user4.copy())
println(user4.copy(name = "Max"))
println(user4.copy(id = 3))









