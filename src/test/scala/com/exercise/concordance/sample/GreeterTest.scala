package com.exercise.concordance.sample

import org.scalatest._

import com.exercise.concordance.fixtures.A

class GreeterTest extends FlatSpec with Matchers {

  "A Greeter" should "return a message starting with 'Hello, '" in {
    // Given
    val greeter = new Greeter(A.name())

    // When
    val result = greeter.sayHi()

    // Then
    result should startWith ("Hello, ")
  }

  it should "return a message that contains provided name" in {
    // Given
    val name = A.name()
    val greeter = new Greeter(name)

    // When
    val result = greeter.sayHi()

    // Then
    result should include (name)
  }
}
