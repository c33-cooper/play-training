package controllers

import play.api.mvc.{Action, Controller}
import models.Product

class ProductsController extends Controller {

  def list = Action { implicit request =>
    val products = Product.findAllProducts
    Ok(views.html.products.listOfProducts(products))
  }

  def show(ean : Long) = Action { implicit request =>

    Product.findByEan(ean).map { foundProduct =>
      Ok(views.html.products.details(foundProduct))
    }.getOrElse(NotFound)
  }
}
