
package views.html.products

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object details_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class details extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Product,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Product)(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(Messages("products.details", product.name))/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
"""),format.raw/*7.1*/("""<h2>
    """),_display_(/*8.6*/tags/*8.10*/.barcode(product.ean)),format.raw/*8.31*/("""
    """),_display_(/*9.6*/Messages("products.details", product.name)),format.raw/*9.48*/("""
"""),format.raw/*10.1*/("""</h2>
<dl class="dl-horizontal">
    <dt>"""),_display_(/*12.10*/Messages("ean")),format.raw/*12.25*/(""":</dt>
    <dd>"""),_display_(/*13.10*/product/*13.17*/.ean),format.raw/*13.21*/("""</dd>
    <dt>"""),_display_(/*14.10*/Messages("name")),format.raw/*14.26*/(""":</dt>
    <dd>"""),_display_(/*15.10*/product/*15.17*/.name),format.raw/*15.22*/("""</dd>
    <dt>"""),_display_(/*16.10*/Messages("description")),format.raw/*16.33*/(""":</dt>
    <dd>"""),_display_(/*17.10*/product/*17.17*/.description),format.raw/*17.29*/("""</dd>
</dl>
""")))}))
      }
    }
  }

  def render(product:Product,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(product)(lang)

  def f:((Product) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (product) => (lang) => apply(product)(lang)

  def ref: this.type = this

}


}

/**/
object details extends details_Scope0.details
              /*
                  -- GENERATED --
                  DATE: Fri Apr 08 16:16:06 BST 2016
                  SOURCE: /Users/callumcooper/Desktop/play-training/app/views/products/details.scala.html
                  HASH: 13ac73d61e7b164ecde27ea4c051baa1c2e1be0d
                  MATRIX: 546->1|750->40|778->115|805->117|861->165|900->167|927->168|962->178|974->182|1015->203|1046->209|1108->251|1136->252|1205->294|1241->309|1284->325|1300->332|1325->336|1367->351|1404->367|1447->383|1463->390|1489->395|1531->410|1575->433|1618->449|1634->456|1667->468
                  LINES: 20->1|26->1|28->5|29->6|29->6|29->6|30->7|31->8|31->8|31->8|32->9|32->9|33->10|35->12|35->12|36->13|36->13|36->13|37->14|37->14|38->15|38->15|38->15|39->16|39->16|40->17|40->17|40->17
                  -- GENERATED --
              */
          