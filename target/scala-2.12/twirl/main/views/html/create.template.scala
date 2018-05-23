
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Note],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(noteForm : Form[Note]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*1.27*/import helper._


Seq[Any](format.raw/*1.25*/(""" """),format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create new Note</title>
<link href='"""),_display_(/*7.14*/routes/*7.20*/.Assets.versioned("css/style.css")),format.raw/*7.54*/("""' rel="stylesheet" />
</head>
<body>
	<h1>Create new Note</h1>
	"""),_display_(/*11.3*/helper/*11.9*/.form(action = routes.NoteController.save())/*11.53*/{_display_(Seq[Any](format.raw/*11.54*/("""
	"""),_display_(/*12.3*/helper/*12.9*/.inputText(noteForm("title"))),format.raw/*12.38*/("""
	"""),_display_(/*13.3*/helper/*13.9*/.inputText(noteForm("comment"))),format.raw/*13.40*/("""

	"""),format.raw/*15.2*/("""<input type="submit" value="Create Note"> """)))}),format.raw/*15.45*/("""
	"""),format.raw/*16.2*/("""<hr>
	<a href="../">Home</a>
</body>
</html>"""))
      }
    }
  }

  def render(noteForm:Form[Note]): play.twirl.api.HtmlFormat.Appendable = apply(noteForm)

  def f:((Form[Note]) => play.twirl.api.HtmlFormat.Appendable) = (noteForm) => apply(noteForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 23:24:57 CEST 2018
                  SOURCE: C:/Users/Maciej/git/playframework/N10-PlayJava/app/views/create.scala.html
                  HASH: 4f59d746a7772a9fa1c4c377c424e2a0d15212d3
                  MATRIX: 953->1|1050->26|1095->24|1122->43|1150->45|1306->175|1320->181|1374->215|1469->284|1483->290|1536->334|1575->335|1605->339|1619->345|1669->374|1699->378|1713->384|1765->415|1797->420|1871->463|1901->466
                  LINES: 28->1|31->1|34->1|34->2|35->3|39->7|39->7|39->7|43->11|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|47->15|47->15|48->16
                  -- GENERATED --
              */
          