const val MIN_AGE = 16
const val MAX_AGE = 90
////função main
fun main(){
  var minhaIdade = 15
    if ((minhaIdade >= MIN_AGE) && (minhaIdade <= 90)){
        println("Você pode doar sangue")
    } else {
        println("Você não pode tirar sangue")
    }
}