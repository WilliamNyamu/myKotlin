fun main(args: Array<String>) {
    val child1 = Child()
    child1.myfunction()
    val dog1 = Dog("white",5)
    dog1.woof()
    val cati = Cat("brown",2)
    cati.meew()
    val Footballer1 = Footballer("Lionel",37,"PSG")
    Footballer1.Football()
    val Volleyballer1 = Volleyballer("Jerry",23,"Eagles")
    Volleyballer1.Volleyball()
}
open class Parent(){
    val x = 5
}
class Child: Parent(){
    fun myfunction(){
        println(x)
    }
}

open class Animal(val color: String,val age: Int){
    init {
        println("Color is $color")
        println("Age is $age")
    }
}
class Dog( color: String, age: Int): Animal(color, age){
     fun woof(){
         println("The dog makes a woof sound")
     }
}
class Cat(color: String,age: Int): Animal(color, age){
    fun meew(){
        println("The cat makes a meow sound")
    }
}
open class Sportsperson(val name: String,val age: Int){
    init {

    }
}
class Footballer(name: String,age: Int,club:String): Sportsperson(name, age){
    fun Football(){
        println("I am a footballer")
    }
}
class Volleyballer(name: String,age: Int,club: String): Sportsperson(name, age){
    fun Volleyball(){
        println("I play volleyball")
    }
}
