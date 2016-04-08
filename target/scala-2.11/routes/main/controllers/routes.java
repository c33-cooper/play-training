
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/callumcooper/Desktop/play-training/conf/routes
// @DATE:Fri Apr 08 16:15:25 BST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseBarcodeController BarcodeController = new controllers.ReverseBarcodeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductsController ProductsController = new controllers.ReverseProductsController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseBarcodeController BarcodeController = new controllers.javascript.ReverseBarcodeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductsController ProductsController = new controllers.javascript.ReverseProductsController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
