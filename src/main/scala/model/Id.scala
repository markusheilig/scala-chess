package model

object Id {
  var nextId = 0;

  def next = {
    val id = nextId
    nextId = nextId + 1
    id
  }
}