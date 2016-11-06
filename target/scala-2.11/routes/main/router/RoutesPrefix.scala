
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Tom/repos/NASty/conf/routes
// @DATE:Sun Nov 06 10:11:41 CST 2016


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
