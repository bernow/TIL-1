package edu.scala.exam2

object Ex_3_1  {
  def main(args: Array[String]): Unit = {
    var x = 20
    if(x > 15) {    // 15보다 클 경우
      println("15보다 큽니다")
      println("껄껄껄")
    } else if(x < 15) { // 15보다 작을 경우
      println("15보다 작습니다")
    } else {      // 그 밖의 경우
      println("과연 뭘까요?")
    }
  }
}
