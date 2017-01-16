package fpscala.c03

import fpscala.datastructures.{List => FpList}

object Exercise11 extends App {

  def sum(l: FpList[Int]) = Exercise10.foldLeft(l, 0)(_ + _)

  def product(l: FpList[Double]) = Exercise10.foldLeft(l, 1.0){_ * _}

  def length[A](l: FpList[A]) = Exercise10.foldLeft(l, 0)((b, _) => b + 1)

}
