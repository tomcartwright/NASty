package controllers

import play.api._
import play.api.mvc._
import models._

class Application extends Controller {
  // Basic Routing for static web pages
  def index = Action {
    Ok(views.html.index())
  }
  def driv = Action {
    Ok(views.html.driv())
  }
  def settings = Action {
    Ok(views.html.settings())
  }
  def trash = Action {
    Ok(views.html.trash())
  }
  def starred = Action {
    Ok(views.html.starred())
  }

  // Rest API
  val drive = new Drive()  // Create new Object
  def listDisks = Action {
    Ok(views.html.index())
  }
  def mountDisk = Action {
    Ok(views.html.index())
  }
  def ls = Action {
    Ok(views.html.index())
  }
  def ll = Action {
    Ok(views.html.index())
  }
  def cd = Action {
    Ok(views.html.index())
  }
  def copyToDisk = Action {
    Ok(views.html.index())
  }
  def copyFromDisk = Action {
    Ok(views.html.index())
  }
  def removeFromDisk = Action {
    Ok(views.html.index())
  }


}