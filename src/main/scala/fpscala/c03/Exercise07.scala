package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

object Exercise07 {

  def foldRightWithShortCircuit[A, B](as: FpList[A], z: B, sc: B*)(f: (A, B) => B): B = as match {
    case FpNil => z
    case Cons(x, _) if ( sc.contains(x) ) => f(x, z)
    case Cons(x, xs) => f(x, foldRightWithShortCircuit(xs, z)(f))
  }

  def sum(ns: FpList[Int]) = foldRightWithShortCircuit(ns, 0.0)(_ + _)

  def product(ns: FpList[Double]) = foldRightWithShortCircuit(ns, 1.0, 0.0)(_ * _)

}
