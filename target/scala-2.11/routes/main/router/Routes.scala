
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Tom/repos/NASty/conf/routes
// @DATE:Sun Nov 06 10:11:41 CST 2016

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
  // @LINE:23
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:23
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """driv.scala.html""", """controllers.Application.driv"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings.scala.html""", """controllers.Application.settings"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trash.scala.html""", """controllers.Application.trash"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """starred.scala.html""", """controllers.Application.starred"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listDisks""", """controllers.Application.listDisks"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mountDisk""", """controllers.Application.mountDisk"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ls""", """controllers.Application.ls"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ll""", """controllers.Application.ll"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cd""", """controllers.Application.cd"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """copyToDisk""", """controllers.Application.copyToDisk"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """copyFromDisk""", """controllers.Application.copyFromDisk"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeFromDisk""", """controllers.Application.removeFromDisk"""),
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
  private[this] lazy val controllers_Application_driv1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("driv.scala.html")))
  )
  private[this] lazy val controllers_Application_driv1_invoker = createInvoker(
    Application_1.driv,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "driv",
      Nil,
      "GET",
      """""",
      this.prefix + """driv.scala.html"""
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

  // @LINE:13
  private[this] lazy val controllers_Application_listDisks5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listDisks")))
  )
  private[this] lazy val controllers_Application_listDisks5_invoker = createInvoker(
    Application_1.listDisks,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "listDisks",
      Nil,
      "GET",
      """ REST API""",
      this.prefix + """listDisks"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_mountDisk6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mountDisk")))
  )
  private[this] lazy val controllers_Application_mountDisk6_invoker = createInvoker(
    Application_1.mountDisk,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "mountDisk",
      Nil,
      "PUT",
      """""",
      this.prefix + """mountDisk"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_ls7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ls")))
  )
  private[this] lazy val controllers_Application_ls7_invoker = createInvoker(
    Application_1.ls,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ls",
      Nil,
      "GET",
      """""",
      this.prefix + """ls"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_ll8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ll")))
  )
  private[this] lazy val controllers_Application_ll8_invoker = createInvoker(
    Application_1.ll,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ll",
      Nil,
      "GET",
      """""",
      this.prefix + """ll"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_cd9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cd")))
  )
  private[this] lazy val controllers_Application_cd9_invoker = createInvoker(
    Application_1.cd,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "cd",
      Nil,
      "POST",
      """""",
      this.prefix + """cd"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_copyToDisk10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("copyToDisk")))
  )
  private[this] lazy val controllers_Application_copyToDisk10_invoker = createInvoker(
    Application_1.copyToDisk,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "copyToDisk",
      Nil,
      "POST",
      """""",
      this.prefix + """copyToDisk"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_copyFromDisk11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("copyFromDisk")))
  )
  private[this] lazy val controllers_Application_copyFromDisk11_invoker = createInvoker(
    Application_1.copyFromDisk,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "copyFromDisk",
      Nil,
      "POST",
      """""",
      this.prefix + """copyFromDisk"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_removeFromDisk12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeFromDisk")))
  )
  private[this] lazy val controllers_Application_removeFromDisk12_invoker = createInvoker(
    Application_1.removeFromDisk,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removeFromDisk",
      Nil,
      "PUT",
      """""",
      this.prefix + """removeFromDisk"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_at13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
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
    case controllers_Application_driv1_route(params) =>
      call { 
        controllers_Application_driv1_invoker.call(Application_1.driv)
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
  
    // @LINE:13
    case controllers_Application_listDisks5_route(params) =>
      call { 
        controllers_Application_listDisks5_invoker.call(Application_1.listDisks)
      }
  
    // @LINE:14
    case controllers_Application_mountDisk6_route(params) =>
      call { 
        controllers_Application_mountDisk6_invoker.call(Application_1.mountDisk)
      }
  
    // @LINE:15
    case controllers_Application_ls7_route(params) =>
      call { 
        controllers_Application_ls7_invoker.call(Application_1.ls)
      }
  
    // @LINE:16
    case controllers_Application_ll8_route(params) =>
      call { 
        controllers_Application_ll8_invoker.call(Application_1.ll)
      }
  
    // @LINE:17
    case controllers_Application_cd9_route(params) =>
      call { 
        controllers_Application_cd9_invoker.call(Application_1.cd)
      }
  
    // @LINE:18
    case controllers_Application_copyToDisk10_route(params) =>
      call { 
        controllers_Application_copyToDisk10_invoker.call(Application_1.copyToDisk)
      }
  
    // @LINE:19
    case controllers_Application_copyFromDisk11_route(params) =>
      call { 
        controllers_Application_copyFromDisk11_invoker.call(Application_1.copyFromDisk)
      }
  
    // @LINE:20
    case controllers_Application_removeFromDisk12_route(params) =>
      call { 
        controllers_Application_removeFromDisk12_invoker.call(Application_1.removeFromDisk)
      }
  
    // @LINE:23
    case controllers_Assets_at13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(Assets_0.at(path, file))
      }
  }
}
