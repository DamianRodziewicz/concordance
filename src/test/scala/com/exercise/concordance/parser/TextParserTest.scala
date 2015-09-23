package com.exercise.concordance.parser

import org.scalatest._

import com.exercise.concordance.fixtures.A

class TextParserTest extends FlatSpec with Matchers {

  "A TextParser" should "return one sentence for a text containing one sentence" in {
    // Given
    val parser = new TextParser()
    val oneSentence = "One sentence."

    // When
    val result = parser.getSentences(oneSentence)

    // Then
    result.length should equal (1)
  }

  it should "return two sentences for a text containing two sentences" in {
    // Given
    val parser = new TextParser()
    val twoSentences = "First sentence. Second sentence."

    // When
    val result = parser.getSentences(twoSentences)

    // Then
    result.length should equal (2)
  }

  it should "return a sentence containing 5 words for a text containing 5 words" in {
    // Given
    val parser = new TextParser()
    val aSentence = "First second thi-rd four.th., \"fifth\"."

    // When
    val result = parser.getSentences(aSentence)

    // Then
    result.length should equal (1)
    result(0).words.length should equal (5)
  }

  it should "remove special chars from text" in {
    // Given
    val specialChars = ",\"'[]()"
    val parser = new TextParser()

    // When
    val result = parser.cleanText(specialChars)

    // Then
    result should equal ("")
  }
}
