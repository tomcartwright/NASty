
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Tom/repos/NASty/conf/routes
// @DATE:Sun Nov 06 10:11:41 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def removeFromDisk: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.removeFromDisk",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "removeFromDisk"})
        }
      """
    )
  
    // @LINE:10
    def starred: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.starred",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "starred.scala.html"})
        }
      """
    )
  
    // @LINE:15
    def ls: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.ls",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ls"})
        }
      """
    )
  
    // @LINE:8
    def settings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.settings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings.scala.html"})
        }
      """
    )
  
    // @LINE:14
    def mountDisk: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.mountDisk",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mountDisk"})
        }
      """
    )
  
    // @LINE:9
    def trash: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.trash",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "trash.scala.html"})
        }
      """
    )
  
    // @LINE:16
    def ll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.ll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ll"})
        }
      """
    )
  
    // @LINE:19
    def copyFromDisk: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.copyFromDisk",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "copyFromDisk"})
        }
      """
    )
  
    // @LINE:7
    def driv: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.driv",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "driv.scala.html"})
        }
      """
    )
  
    // @LINE:13
    def listDisks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.listDisks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listDisks"})
        }
      """
    )
  
    // @LINE:18
    def copyToDisk: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.copyToDisk",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "copyToDisk"})
        }
      """
    )
  
    // @LINE:17
    def cd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.cd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cd"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
