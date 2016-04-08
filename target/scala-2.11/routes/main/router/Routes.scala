
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/callumcooper/Desktop/play-training/conf/routes
// @DATE:Fri Apr 08 16:15:25 BST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:8
  ProductsController_2: controllers.ProductsController,
  // @LINE:12
  BarcodeController_3: controllers.BarcodeController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    ProductsController_2: controllers.ProductsController,
    // @LINE:12
    BarcodeController_3: controllers.BarcodeController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ProductsController_2, BarcodeController_3, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ProductsController_2, BarcodeController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductsController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """ean<[^/]+>""", """controllers.ProductsController.show(ean:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """barcode/""" + "$" + """ean<[^/]+>""", """controllers.BarcodeController.barcode(ean:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductsController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductsController_list1_invoker = createInvoker(
    ProductsController_2.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """products"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductsController_show2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_show2_invoker = createInvoker(
    ProductsController_2.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """products/""" + "$" + """ean<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BarcodeController_barcode3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("barcode/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BarcodeController_barcode3_invoker = createInvoker(
    BarcodeController_3.barcode(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BarcodeController",
      "barcode",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """barcode/""" + "$" + """ean<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
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
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_ProductsController_list1_route(params) =>
      call { 
        controllers_ProductsController_list1_invoker.call(ProductsController_2.list)
      }
  
    // @LINE:10
    case controllers_ProductsController_show2_route(params) =>
      call(params.fromPath[Long]("ean", None)) { (ean) =>
        controllers_ProductsController_show2_invoker.call(ProductsController_2.show(ean))
      }
  
    // @LINE:12
    case controllers_BarcodeController_barcode3_route(params) =>
      call(params.fromPath[Long]("ean", None)) { (ean) =>
        controllers_BarcodeController_barcode3_invoker.call(BarcodeController_3.barcode(ean))
      }
  
    // @LINE:15
    case controllers_Assets_at4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_1.at(path, file))
      }
  }
}
