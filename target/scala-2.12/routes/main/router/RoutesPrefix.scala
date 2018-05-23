// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Maciej/git/playframework/N10-PlayJava/conf/routes
// @DATE:Wed May 23 23:24:57 CEST 2018


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
