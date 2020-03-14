package com.lagosscala.learnobject

class ObjectCompanion (sing: List[String]) {
  def singSong =  s"Thanks for sharing this songs ${sing.mkString(",")} with us"
}


object ObjectCompanion {
  def apply(song1:String, song2: String): ObjectCompanion =  {
    val twoSongs = List(song1, song2)
    new ObjectCompanion(twoSongs)
  }

  def apply(song1:String, song2:String, song3:String): ObjectCompanion = {
    val threeSongs = List(song1, song2, song3)
    new ObjectCompanion(threeSongs)
  }
}


object TestCompanion extends App {
  val singTwo = ObjectCompanion("Lovey - dovey", "Just rocking")
  println(singTwo.singSong)

  val singThree = ObjectCompanion("Joe winning", "Honor in the moon", "Winning")
  println(singThree.singSong)
}