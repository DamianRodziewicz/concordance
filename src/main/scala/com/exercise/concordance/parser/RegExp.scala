package com.exercise.concordance.parser

object RegExp {
  val SentenceEndRegExp = "(?<=[.?!])\\s+(?=[A-Z])";
  val UnnecessaryChars = "[\\[\\],\"'\\(\\)]";
  val Whitespace = "\\s"
}
