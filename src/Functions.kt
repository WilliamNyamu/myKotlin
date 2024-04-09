fun main(args: Array<String>) {
    Hello("Gerald")
    Hello("Ann")
    calculateAge(23)
    calculateAge(40)
    calculateAge1(2020,2023)
    calculateAge1(2005,2024)
    details("John",2000,"eMobilis")
    println(add(70.0,80.0))
    println(birthdayGreeting("Mary",20))
    println("The area is: " + area())
    println(person("John",45))
    println("You're bmi is: "+bmi())
    println("The circle's area is:"+circle(3.14,21.0))
}
fun Hello(name: String){
    println("Hello $name")
}
fun calculateAge(Age: Int){
    println("You are $Age years old")
}
fun calculateAge1(birthYear: Int,currentYear: Int){
    val sum = currentYear.minus (birthYear)
    println("You are $sum years old")
}
fun details(Name: String,yearofBirth: Int,School: String){
    println("Hey $Name, you're born in $yearofBirth and schooled at $School")
}
fun add(num1: Double,num2: Double): Double {
    val summation = num1+num2
    return summation
}
fun birthdayGreeting(name:String,age: Int):String{
    val a = "Hey $name"
    val b = "Congratulations you are $age years old"
    return "$a\n$b"
}
fun area(width:Double = 12.0,length:Double = 18.0):Double{
    val multiply = width*length
    return multiply
}
fun person(name:String,age: Int,company:String = "eMobilis"): String{
    val profile = "Employee $name is of age $age and works at $company"
    return profile
}
fun bmi(weight:Double = 55.0,height:Double = 1.2):Double{
    val Bmi = weight/(height*height)
    return Bmi
}
fun circle(pi:Double = 3.14,radius:Double):Double{
    val area1=pi*radius*2
    return area1
}