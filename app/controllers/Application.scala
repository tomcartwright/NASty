package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {
  def index = Action {
    Ok(views.html.index())
  }
  def drive = Action {
    Ok(views.html.drive())
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
}