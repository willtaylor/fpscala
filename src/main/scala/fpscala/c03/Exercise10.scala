package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

import scala.annotation.tailrec

object Exercise10 {

  @tailrec
  def foldLeft[A, B](as: FpList[A], z: B)(f: (B, A) => B): B = as match {
    case FpNil => z
    case Cons(x, xs) => foldLeft(xs, f(z, x))(f)
  }

}
