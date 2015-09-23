package com.exercise.concordance

import scala.collection.mutable.{HashMap, ListBuffer}

/** A container that stores information about words and their occurences.
  *
  * The indexes are stored in the order they were added.
  */
class Concordance() {
  val wordsMap: HashMap[String, ListBuffer[Int]] = new HashMap()

  def add(word: String, sentenceIndex: Int) = {
    if (this.wordsMap contains word) {
      this.wordsMap(word) += sentenceIndex
    } else {
      this.wordsMap(word) = ListBuffer(sentenceIndex)
    }
  }

  def getSentenceIndexes(word: String): Option[List[Int]] = {
    this.wordsMap.get(word) map { _.toList }
  }

  def printResults() = {
    val keys = this.wordsMap.keys.toList.sorted
    keys foreach { key => {
        val indexes = this.getSentenceIndexes(key).get
        val indexesString = indexes.mkString(",")
        println(s"${key} {${indexes.length}:${indexesString}} ")
      }
    }
  }
}
