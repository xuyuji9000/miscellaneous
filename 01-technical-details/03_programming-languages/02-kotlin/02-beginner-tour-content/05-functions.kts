fun hello() {
    return println("Hello, world!")
}

hello()





fun sum1(x: Int, y: Int): Int {
    return x+y
}
println(sum1(1,2))


// 1. named arguments
println("--- Named arguments ---")
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

printMessageWithPrefix(prefix = "Log", message = "Hello")
printMessageWithPrefix(message = "Hello")

// 2. single-expression function
println("--- Single-expression function ---")
fun sum2(x: Int, y: Int):Int = x+y

println(sum2(1,2))

// 3. early returns in functions
println("--- Early returns in functions ---")

val registeredUsernames = mutableListOf<String>("john_doe", "jane_smith")
val registeredEmails    = mutableListOf<String>("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    // early return if the username is already taken
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }

    // early return if the email is already registered.
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

println(registerUser("john_doe", "newjohn@example.com"))
println(registerUser("new_user", "newuser@example.com"))


