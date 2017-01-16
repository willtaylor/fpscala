package fpscala.c03

import fpscala.datastructures.{List => FpList}

object Exercise13 extends App {

  def foldLeft[A, B](as: FpList[A], z: B)(f: (B, A) => B): B = FpList.foldRight(as, z)((a, b) => f(b, a))

  def foldRight[A, B](as: FpList[A], z: B)(f: (A, B) => B): B = Exercise10.foldLeft(as, z)((b, a) => f(a, b))

}
