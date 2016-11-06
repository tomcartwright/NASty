package models

/**
  * Created by Tom on 11/6/16.
  */
object Logger {
  def debug(s: String): Unit = println(s"DEBUG - ${s}")
}
