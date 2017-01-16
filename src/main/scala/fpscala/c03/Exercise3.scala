package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList}

object Exercise3 {

  def setHead[A](xs: FpList[A], x: A): FpList[A] = Cons(x, Exercise2.tail(xs))

}
