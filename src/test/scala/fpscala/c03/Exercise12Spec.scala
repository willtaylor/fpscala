package fpscala.c03

import fpscala.datastructures.{List => FpList, Nil => FpNil}
import org.scalatest.{FlatSpec, Matchers}

class Exercise12Spec extends FlatSpec with Matchers {

  "foldLeft sum, product, and length" should "work" in {
    Exercise12.reverse(FpList(1, 2, 3, 4)) shouldBe FpList(4, 3, 2, 1)
    Exercise12.reverse(FpNil) shouldBe FpNil
  }

}
