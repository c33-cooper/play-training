
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object main_Scope1 {
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String)(content: Html)(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.53*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*8.13*/title),format.raw/*8.18*/("""</title>
    <link rel="stylesheet" type="text/css" media="screen"
          href='"""),_display_(/*10.18*/routes/*10.24*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*10.63*/("""'>
    <link rel="stylesheet" media="screen"
          href=""""),_display_(/*12.18*/routes/*12.24*/.Assets.at("stylesheets/main.css")),format.raw/*12.58*/("""">
</head>
<body>
<div class="screenshot">
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <a class="brand" href=""""),_display_(/*19.41*/routes/*19.47*/.HomeController.index()),format.raw/*19.70*/("""">
                    """),_display_(/*20.22*/Messages("application.name")),format.raw/*20.50*/("""
                """),format.raw/*21.17*/("""</a> </div>
        </div>
    </div>
    <div class="container">
        """),_display_(/*25.10*/content),format.raw/*25.17*/("""
        """),_display_(/*26.10*/debug()),format.raw/*26.17*/("""
    """),format.raw/*27.5*/("""</div>
</div>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(lang)

  def f:((String) => (Html) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (lang) => apply(title)(content)(lang)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Fri Apr 08 16:15:01 BST 2016
                  SOURCE: /Users/callumcooper/Desktop/play-training/app/views/main.scala.html
                  HASH: 9be01ea9977f80cbf00e019895725b5f462ed122
                  MATRIX: 633->75|779->126|806->127|874->169|899->174|1010->258|1025->264|1085->303|1174->365|1189->371|1244->405|1467->601|1482->607|1526->630|1577->654|1626->682|1671->699|1773->774|1801->781|1838->791|1866->798|1898->803
                  LINES: 24->4|29->4|30->5|33->8|33->8|35->10|35->10|35->10|37->12|37->12|37->12|44->19|44->19|44->19|45->20|45->20|46->21|50->25|50->25|51->26|51->26|52->27
                  -- GENERATED --
              */
          