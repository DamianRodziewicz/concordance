package com.exercise.concordance

import sample.Greeter
import parser.TextParser
import reader.FileReader

object Main {
  def main(args: Array[String]) = {
    if (args.length != 1) {
      println("Usage: sbt run {filePath}")
      System.exit(1)
    }

    val fileReader = new FileReader()
    val textParser = new TextParser()
    val concordanceBuilder = new ConcordanceBuilder(fileReader, textParser)

    val concordance = concordanceBuilder.build(args(0))
    concordance.printResults
  }
}
