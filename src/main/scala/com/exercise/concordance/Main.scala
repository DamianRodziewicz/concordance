package com.excercise.concordance

import com.exercise.concordance.sample.Greeter

object Main {
  def main(args: Array[String]) = {
    val greeter = new Greeter("Damian");
    println(greeter.sayHi())
  }
}
