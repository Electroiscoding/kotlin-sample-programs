class Person(val name: String, val age: Int) {
    fun introduce() {
        println("Hi, my name is " + name + " and I'm " + age + " years old.")
    }
}

fun main() {
    val person = Person("Soham", 15)
    person.introduce()
