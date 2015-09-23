package com.exercise.concordance.fixtures

import scala.util.Random

object A {
  val random = new Random()

  def name() = "SAMPLE_NAME"
  def word() = "SAMPLE_WORD"
  def randomInt() = random.nextInt()
}
