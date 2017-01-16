package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

object Exercise12 {

  def reverse[A](l: FpList[A]): FpList[A] = Exercise10.foldLeft(l, FpNil: FpList[A])((b, a) => Cons(a, b))

}
