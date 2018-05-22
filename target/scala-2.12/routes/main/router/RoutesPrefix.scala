// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Programy/JavaWorkspace/playframework/n11-playjava/conf/routes
// @DATE:Tue May 22 21:52:19 CEST 2018


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
