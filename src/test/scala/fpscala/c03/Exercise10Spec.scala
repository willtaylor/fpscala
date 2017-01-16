package fpscala.c03

import fpscala.datastructures.{List => FpList, Nil => FpNil}
import org.scalatest.{FlatSpec, Matchers}

class Exercise10Spec extends FlatSpec with Matchers {

  "foldLeft" should "work" in {
    Exercise10.foldLeft(FpList(1, 2, 3, 4), 0)(_ + _) should equal (10)
    Exercise10.foldLeft(FpList(1.0, 2.0, 3.0, 4.0, 0.0), 1.0)(_ * _) should equal (0.0)
    Exercise10.foldLeft(FpList(1.0, 2.0, 3.0, 4.0), 1.0)(_ * _) should equal (24.0)
  }

}
