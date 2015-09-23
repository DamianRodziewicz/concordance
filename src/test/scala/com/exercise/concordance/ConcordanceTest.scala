package com.exercise.concordance

import org.scalatest._

import fixtures.A

class GreeterTest extends FlatSpec with Matchers {

  "A Concordance" should "return None for a word that it does not contain" in {
    // Given
    val concordance = new Concordance()

    // When
    val result = concordance getSentenceIndexes A.word()

    // Then
    result should be (None)
  }

  it should "return list of indexes for a word with one index added" in {
    // Given
    val aWord = A.word()
    val aSentenceIndex = A.randomInt()
    val concordance = new Concordance()

    // When
    concordance.add(aWord, aSentenceIndex)
    val result = concordance getSentenceIndexes A.word()

    // Then
    result should be (Some(List(aSentenceIndex)))
  }

  it should "return list of indexes for a word in the same order they were put" in {
    // Given
    val aWord = A.word()
    val firstSentenceIndex = A.randomInt()
    val secondSentenceIndex = A.randomInt()
    val concordance = new Concordance()

    // When
    concordance.add(aWord, firstSentenceIndex)
    concordance.add(aWord, secondSentenceIndex)
    val result = concordance getSentenceIndexes A.word()

    // Then
    result should be (Some(List(firstSentenceIndex, secondSentenceIndex)))
  }
}
