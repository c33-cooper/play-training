
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/callumcooper/Desktop/play-training/conf/routes
// @DATE:Fri Apr 08 16:15:25 BST 2016


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
