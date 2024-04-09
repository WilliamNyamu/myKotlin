
fun main(args: Array<String>) {
    val obj1 = Cars("vitz","toyota","1990")
    val obj2 = Cars("Ford","Mustang","1990")
    val obj3 = Cars("Mazda","toyota","2010")
    println(obj1.model)
    println(obj2.brand)
    val person1 = Person("John",15)
    person1.canVote(15)
    val person2 = Person("Esther",22)
    person2.canVote(22)
    val person3 = Person("Doe",18)
    person3.canVote(18)
    val student1 = Student("Mary",79.5)
    student1.Promote(79.5)
    val product1 = Product("Sugar",200.50,12)
    println(product1.calculateTotalCost())
}
class Cars(val model:String,val brand:String,val year:String){
//    val model = ""
//    val brand = ""
//    val year = ""
}
class Person(val name:String,val age:Int){
    fun canVote(age: Int){
        if (age < 18){
            println("You cannot vote")
        }else{
            println("You can vote")
        }
    }
}
class Student(val name: String,val grade:Double){
    fun Promote(grade: Double){
        if (grade>80){
            println("Promote")
        }else{
            println("Do not promote")
        }
    }
}
class Product(
    val name:String,
    val price:Double,
    val quantity:Int
){
    fun calculateTotalCost():Double{
        return price*quantity

    }
}