package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

object Exercise02 {

  def tail[A](l: FpList[A]): FpList[A] = l match {
    case FpNil => throw new IllegalArgumentException("tail undefined for empty List")
    case Cons(x, xs) => xs
  }

}
