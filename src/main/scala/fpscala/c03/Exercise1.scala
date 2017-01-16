package fpscala.c03

object Exercise1 extends App {

  val x = List(1, 2, 3, 4, 5) match {
    case x :: 2 :: 4 :: _ => x
    case Nil => 42
    case x :: y :: 3 :: 4 :: _ => x + y
    case h :: t => h + t.sum
    case _ => 101
  }

  println("Will thinks the answer is 3 (the third case will match - a list of x, y, 3, 4, _ which yields x + y)")
  println(if ( x == 3 ) "Will is right! :)" else "Will is wrong! :(")

}
