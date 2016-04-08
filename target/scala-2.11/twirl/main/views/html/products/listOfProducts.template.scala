
package views.html.products

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listOfProducts_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object listOfProducts_Scope1 {
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

class listOfProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Product],Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product])(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.48*/("""

"""),_display_(/*6.2*/main(Messages("application.name"))/*6.36*/ {_display_(Seq[Any](format.raw/*6.38*/("""
    """),format.raw/*7.5*/("""<dl class="products">
        """),_display_(/*8.10*/for(product <- products) yield /*8.34*/ {_display_(Seq[Any](format.raw/*8.36*/("""
        """),format.raw/*9.9*/("""<dt>"""),_display_(/*9.14*/product/*9.21*/.name),format.raw/*9.26*/("""</dt>
        <dd>"""),_display_(/*10.14*/product/*10.21*/.description),format.raw/*10.33*/("""</dd>
        """)))}),format.raw/*11.10*/(""" """),format.raw/*11.11*/("""</dl>
""")))}))
      }
    }
  }

  def render(products:List[Product],lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(products)(lang)

  def f:((List[Product]) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (products) => (lang) => apply(products)(lang)

  def ref: this.type = this

}


}
}

/**/
object listOfProducts extends listOfProducts_Scope0.listOfProducts_Scope1.listOfProducts
              /*
                  -- GENERATED --
                  DATE: Fri Apr 08 16:15:01 BST 2016
                  SOURCE: /Users/callumcooper/Desktop/play-training/app/views/products/listOfProducts.scala.html
                  HASH: f1b6b11c1ea1d7205f9e24babb6f3f9a80bcce22
                  MATRIX: 674->75|815->121|843->124|885->158|924->160|955->165|1012->196|1051->220|1090->222|1125->231|1156->236|1171->243|1196->248|1242->267|1258->274|1291->286|1337->301|1366->302
                  LINES: 24->4|29->4|31->6|31->6|31->6|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11
                  -- GENERATED --
              */
          