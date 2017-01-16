package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

object Exercise06 {

  def append[A](a: A, l: FpList[A]): FpList[A] = l match {
    case FpNil => Cons(a, FpNil)
    case Cons(x, xs) => Cons(x, append(a, xs))
  }

  def init[A](l: FpList[A]): FpList[A] = {

    def go(accum: FpList[A], orig: FpList[A]): FpList[A] = orig match {
      case FpNil => accum
      case Cons(x, FpNil) => accum
      case Cons(x, xs) => go(append(x, accum), xs)
    }

    go(FpNil, l)
  }

}
