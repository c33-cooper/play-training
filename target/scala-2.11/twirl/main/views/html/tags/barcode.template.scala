
package views.html.tags

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object barcode_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class barcode extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ean: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.13*/("""

"""),format.raw/*3.1*/("""<img class="barcode" alt=""""),_display_(/*3.28*/ean),format.raw/*3.31*/("""" src=""""),_display_(/*3.39*/routes/*3.45*/.BarcodeController.barcode(ean)),format.raw/*3.76*/("""">"""))
      }
    }
  }

  def render(ean:Long): play.twirl.api.HtmlFormat.Appendable = apply(ean)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (ean) => apply(ean)

  def ref: this.type = this

}


}

/**/
object barcode extends barcode_Scope0.barcode
              /*
                  -- GENERATED --
                  DATE: Fri Apr 08 16:16:25 BST 2016
                  SOURCE: /Users/callumcooper/Desktop/play-training/app/views/tags/barcode.scala.html
                  HASH: 201b07775117d2717eea7de4251bfc56228de21c
                  MATRIX: 534->1|640->12|668->14|721->41|744->44|778->52|792->58|843->89
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|27->3|27->3
                  -- GENERATED --
              */
          