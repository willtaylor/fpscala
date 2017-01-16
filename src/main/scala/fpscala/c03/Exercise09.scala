package fpscala.c03

import fpscala.datastructures.{List => FpList}

object Exercise09 {

  def length[A](as: FpList[A]): Int = FpList.foldRight(as, 0)((_, b) => b + 1)

}
