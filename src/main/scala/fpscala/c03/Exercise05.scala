package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

import scala.annotation.tailrec

object Exercise05 {

  @tailrec
  def dropWhile[A](l: FpList[A], p: A => Boolean): FpList[A] = l match {
    case FpNil => FpNil
    case Cons(x, xs) if ( !p(x) ) => l
    case Cons(_, xs) => dropWhile(xs, p)
  }

}
