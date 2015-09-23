package com.exercise.concordance.parser

import scala.collection.mutable.ListBuffer

import symbols.Sentence

/* A parser that parses text and returns sentences. */
class TextParser() extends ITextParser {

  def getSentences(text: String): List[Sentence] = {
    val rawSentences = text.split(RegExp.SentenceEndRegExp)
    var cleanedSentences = rawSentences map cleanText
    var cleanedWordLists = cleanedSentences map (_.split(RegExp.Whitespace))
    cleanedWordLists map { words => Sentence(words.toList) } toList
  }

  def cleanText(sentence: String): String = {
    sentence.trim().dropRight(1).toLowerCase().replaceAll(RegExp.UnnecessaryChars, "")
  }
}
