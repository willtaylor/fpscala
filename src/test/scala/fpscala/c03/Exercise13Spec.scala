package fpscala.c03

import fpscala.datastructures.{List => FpList}
import org.scalatest.{FlatSpec, Matchers}

class Exercise13Spec extends FlatSpec with Matchers {

  "foldLeft implemented in terms of foldRight" should "work" in {
    Exercise13.foldLeft(FpList(1, 2, 3, 4), 0)(_ + _) should equal (10)
    Exercise13.foldLeft(FpList(1.0, 2.0, 3.0, 4.0), 1.0)(_ * _) should equal (24)
  }

  "foldRight implemented in terms of foldLeft" should "work" in {
    Exercise13.foldRight(FpList(1, 2, 3, 4), 0)(_ + _) should equal (10)
    Exercise13.foldRight(FpList(1.0, 2.0, 3.0, 4.0), 1.0)(_ * _) should equal (24)
  }

}
