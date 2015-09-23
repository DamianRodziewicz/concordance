package com.exercise.concordance.reader

import scala.io.Source

class FileReader() extends IFileReader {

  def getText(fileName: String): String = {
    val source = Source.fromFile(fileName)
    val result = source.mkString
    source.close()
    result
  }
}
