package fpscala.c03

import fpscala.datastructures.{List => FpList, Nil => FpNil}
import org.scalatest.{FlatSpec, Matchers}

class Exercise14Spec extends FlatSpec with Matchers {

  "foldRight append" should "work" in {
    Exercise14.append(FpList(1, 2, 3, 4), FpList(5, 6)) shouldBe FpList(1, 2, 3, 4, 5, 6)
    Exercise14.append(FpList(5), FpNil) shouldBe FpList(5)
  }

}
