fun main() {
var bingo = listOf(10,9,8,6,2,22,30,27,17)
var number = (1..34).random()

if (number in bingo){
    println(number.toString() + " BINGO!!")
} else {
    println(number.toString() + " VISH!")
}
}