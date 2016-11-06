package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import models._

class Application extends Controller {
  // Basic Routing for static web pages
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

  // Rest API
  val Drive = new NAStyDrive()  // Create new Object

  def listDisks = Action {
    val json: JsValue = Json.obj("disks" -> Json.toJson(Drive.listDisks()))
    Ok(json)
  }
  def mountDisk(dir: String) = Action {
    val clean_dir: String = dir.replaceAll("(%2f)", "/")
    val success:Int = Drive.mountDisk(clean_dir)
    val json: JsValue = Json.obj("success" -> Json.toJson(success))
    Ok(json)
  }
  def ls = Action {
    val ls_list: List[String] = Drive.ls()
    val json: JsValue = Json.obj("ls" -> Json.toJson(ls_list))
    Ok(json)
  }
  def ll = Action {
    val ll_list: List[String] = Drive.ll()
    val json: JsValue = Json.obj("ll" -> Json.toJson(ll_list))
    Ok(json)
  }
  def cd(dir: String) = Action {
    val clean_dir: String = dir.replaceAll("(%2f)", "/")
    val success: Int = Drive.cd(clean_dir)
    val json: JsValue = Json.obj("success" -> Json.toJson(success))
    Ok(json)
  }
  def copyToDisk(infpath: String, outpath: String) = Action {
    val success: Int = Drive.copyToDisk(infpath.replaceAll("(%2f)", "/"), outpath.replaceAll("(%2f)", "/"))
    val json: JsValue = Json.obj("success" -> Json.toJson(success))
    Ok(json)
  }
  def copyFromDisk(infpath: String, outpath: String) = Action {
    val success: Int = Drive.copyFromDisk(infpath.replaceAll("(%2f)", "/"), outpath.replaceAll("(%2f)", "/"))
    val json: JsValue = Json.obj("success" -> Json.toJson(success))
    Ok(json)
  }
  def removeFromDisk(fpath: String) = Action {
    val success: Int = Drive.removeFromDisk(fpath.replaceAll("(%2f)", "/"))
    val json: JsValue = Json.obj("success" -> Json.toJson(success))
    Ok(json)
  }
}