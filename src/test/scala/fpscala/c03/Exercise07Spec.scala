package fpscala.c03

import fpscala.datastructures.{List => FpList}
import org.scalatest.{FlatSpec, Matchers}

class Exercise07Spec extends FlatSpec with Matchers {

  "product" should "short circuit" in {
    Exercise07.product(FpList(0.0, 1.0, 2.0, 3.0)) should equal (0.0)
  }

  "sum" should "still work" in {
    Exercise07.sum(FpList(1, 2, 3, 4)) should equal (10)
  }

}
