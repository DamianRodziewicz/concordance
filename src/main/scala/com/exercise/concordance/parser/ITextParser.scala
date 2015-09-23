package com.exercise.concordance.parser

import scala.collection.mutable.ListBuffer

import symbols.Sentence

/* A parser that parses text and returns sentences. */
trait ITextParser {
  def getSentences(text: String): List[Sentence];
}
