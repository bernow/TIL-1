package edu.scala.exam2

object Ex_4_4 {
  def main(args: Array[String]): Unit = {
    val richUser = new PaidUser("고말자", 20, 'M', 10000)
    //richUser.sayName
    richUser.showMoney
  }
}

class User(name: String, age: Int, sex: Char) {
  val sayName = println("제 이름은 " + name)
}

class PaidUser(name: String, age: Int, sex: Char, money: Int)
  extends User(name, age, sex) {
    val showMoney = println(money + "원이 있습니다.")
}
