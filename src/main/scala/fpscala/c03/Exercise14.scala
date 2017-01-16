package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

object Exercise14 {

  def append[A](as1: FpList[A], as2: FpList[A]): FpList[A] = FpList.foldRight(as1, as2)(Cons(_, _))

}
