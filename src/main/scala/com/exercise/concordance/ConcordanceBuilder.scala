package com.exercise.concordance

import reader.IFileReader
import parser.ITextParser

class ConcordanceBuilder(val fileReader: IFileReader, val parser: ITextParser) {
  def build(fileName: String): Concordance = {
    val result = new Concordance();
    val text = fileReader.getText(fileName)
    val sentences = parser.getSentences(text)

    for (sentenceIndex <- 0 until sentences.length) {
      sentences(sentenceIndex).words map (result.add(_, sentenceIndex))
    }

    result
  }
}
