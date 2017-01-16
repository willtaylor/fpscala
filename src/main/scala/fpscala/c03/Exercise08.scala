package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

object Exercise08 extends App {

  val doIt = FpList.foldRight(FpList(1, 2, 3), FpNil: FpList[Int])(Cons(_, _))

  println("Will thinks this will return an equivalent list")
  println(if ( doIt == FpList(1, 2, 3) ) "Will is right! :)" else "Will is wrong! :(")

}
