package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

import scala.annotation.tailrec

object Exercise4 {

  @tailrec
  def drop[A](l: FpList[A], n: Int): FpList[A] = l match {
    case _ if ( n == 0 ) => l
    case FpNil => throw new IndexOutOfBoundsException("can't drop more elements than the list contains")
    case _ if ( n < 0 ) => throw new IndexOutOfBoundsException("can't drop fewer than zero elements")
    case Cons(_, xs) => drop(xs, n - 1)
  }

}
