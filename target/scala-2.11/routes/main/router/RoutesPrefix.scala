
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/seanavila/repos/NASty/conf/routes
// @DATE:Sun Nov 06 05:53:05 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
