
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/seanavila/repos/NASty/conf/routes
// @DATE:Sun Nov 06 05:53:05 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drive.scala.html""", """controllers.Application.drive"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings.scala.html""", """controllers.Application.settings"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trash.scala.html""", """controllers.Application.trash"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """starred.scala.html""", """controllers.Application.starred"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_drive1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drive.scala.html")))
  )
  private[this] lazy val controllers_Application_drive1_invoker = createInvoker(
    Application_1.drive,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "drive",
      Nil,
      "GET",
      """""",
      this.prefix + """drive.scala.html"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_settings2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings.scala.html")))
  )
  private[this] lazy val controllers_Application_settings2_invoker = createInvoker(
    Application_1.settings,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "settings",
      Nil,
      "GET",
      """""",
      this.prefix + """settings.scala.html"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_trash3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trash.scala.html")))
  )
  private[this] lazy val controllers_Application_trash3_invoker = createInvoker(
    Application_1.trash,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "trash",
      Nil,
      "GET",
      """""",
      this.prefix + """trash.scala.html"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_starred4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("starred.scala.html")))
  )
  private[this] lazy val controllers_Application_starred4_invoker = createInvoker(
    Application_1.starred,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "starred",
      Nil,
      "GET",
      """""",
      this.prefix + """starred.scala.html"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:7
    case controllers_Application_drive1_route(params) =>
      call { 
        controllers_Application_drive1_invoker.call(Application_1.drive)
      }
  
    // @LINE:8
    case controllers_Application_settings2_route(params) =>
      call { 
        controllers_Application_settings2_invoker.call(Application_1.settings)
      }
  
    // @LINE:9
    case controllers_Application_trash3_route(params) =>
      call { 
        controllers_Application_trash3_invoker.call(Application_1.trash)
      }
  
    // @LINE:10
    case controllers_Application_starred4_route(params) =>
      call { 
        controllers_Application_starred4_invoker.call(Application_1.starred)
      }
  
    // @LINE:14
    case controllers_Assets_at5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_0.at(path, file))
      }
  }
}
