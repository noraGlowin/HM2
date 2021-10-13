/*Non-return type function
It's use the keyword void to declaration
It's used to performs a task but it does not return a value
It's also used for set conditions or print other functions
Example
In programming we have to make our code clean so every function has to do only one mission
 */
//return type function
fun getInfo(name:String , age:Int):String{
    var info: String = "$name $age years old"
    return info
}
//non Return type function printing return type function
fun printInfo(name:String , age:Int) {
    println(getInfo(name, age))
}

fun main(args: Array<String>) {
printInfo("nora", 29)

}