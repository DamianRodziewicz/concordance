package com.exercise.concordance

import org.scalatest._
import org.scalamock.scalatest.proxy.MockFactory

import fixtures.A
import parser.ITextParser
import reader.IFileReader

class ConcordanceBuilderTest extends FlatSpec with Matchers with MockFactory {

  "A ConcordanceBuidler" should "call IFileReader with given fileName" in {
    // Given
    val fileName = "SOME_FILENAME"
    val someText = "SOME_TEXT"
    val fileReader = mock[IFileReader]
    val textParser = mock[ITextParser]
    val concordanceBuilder = new ConcordanceBuilder(fileReader, textParser)

    fileReader.expects('getText)(fileName).returning(someText)
    textParser.expects('getSentences)(someText).returning(List())

    // When
    val result = concordanceBuilder.build(fileName)

    // Then
  }
}
