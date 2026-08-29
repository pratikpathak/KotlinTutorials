package designpattern.ceationalPatterns

/*
*   Here Singleton Pattern is created using Object Class
*   Singleton -> Restricts a class to a single instance
*   and provides global access to it.
* */
object DatabaseManager {
    init {
        println("DatabaseManager initialized.")
    }

    private val connections = mutableListOf<String>()

    fun connect() {
        println("Connected to the database.")
    }

    fun executeQuery(query: String) {
        println("Executing query: $query")
    }
}

fun main() {
    // Accessing the singleton instance directly via its name
    DatabaseManager.connect()
    DatabaseManager.executeQuery("SELECT * FROM users")

    // No instantiation needed or allowed: DatabaseManager() will throw a compiler error
}