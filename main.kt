fun main() {

    println(inLove(22, 17))

}

fun inLove(firstNum: Int, secondNum: Int): Boolean{

    return ((firstNum % 2 == 0) && (secondNum % 2 != 0)) || ((firstNum % 2 != 0) && (secondNum % 2 == 0))

}