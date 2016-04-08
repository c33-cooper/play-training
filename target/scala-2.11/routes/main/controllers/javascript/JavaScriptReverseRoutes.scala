
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/callumcooper/Desktop/play-training/conf/routes
// @DATE:Fri Apr 08 16:15:25 BST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:12
  class ReverseBarcodeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def barcode: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BarcodeController.barcode",
      """
        function(ean0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "barcode/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean0)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseProductsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:10
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.show",
      """
        function(ean0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean0)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
