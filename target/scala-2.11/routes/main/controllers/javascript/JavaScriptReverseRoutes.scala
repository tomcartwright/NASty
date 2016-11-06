
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/seanavila/repos/NASty/conf/routes
// @DATE:Sun Nov 06 05:53:05 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
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

  
    // @LINE:7
    def drive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.drive",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drive.scala.html"})
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
  
    // @LINE:8
    def settings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.settings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings.scala.html"})
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
