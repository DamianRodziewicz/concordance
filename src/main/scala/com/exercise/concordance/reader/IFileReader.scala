package com.exercise.concordance.reader

trait IFileReader {
  def getText(fileName: String): String
}
