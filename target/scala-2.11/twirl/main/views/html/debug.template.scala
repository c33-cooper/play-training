
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object debug_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class debug extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit lang : Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<footer>
    lang = """),_display_(/*6.13*/lang/*6.17*/.code),format.raw/*6.22*/(""",
    user = """),_display_(/*7.13*/current/*7.20*/.configuration.getString("environment.user")),format.raw/*7.64*/(""",
    date = """),_display_(/*8.13*/(new java.util.Date().format("yyyy-MM-dd HH:mm"))),format.raw/*8.62*/("""
"""),format.raw/*9.1*/("""</footer>"""))
      }
    }
  }

  def render(lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply()(lang)

  def f:(() => (Lang) => play.twirl.api.HtmlFormat.Appendable) = () => (lang) => apply()(lang)

  def ref: this.type = this

}


}

/**/
object debug extends debug_Scope0.debug
              /*
                  -- GENERATED --
                  DATE: Fri Apr 08 16:15:01 BST 2016
                  SOURCE: /Users/callumcooper/Desktop/play-training/app/views/debug.scala.html
                  HASH: 64c41388868fc2999585d0ed8fb7a649828d8e37
                  MATRIX: 525->1|672->25|700->57|727->58|774->79|786->83|811->88|851->102|866->109|930->153|970->167|1039->216|1066->217
                  LINES: 20->1|25->1|27->4|28->5|29->6|29->6|29->6|30->7|30->7|30->7|31->8|31->8|32->9
                  -- GENERATED --
              */
          