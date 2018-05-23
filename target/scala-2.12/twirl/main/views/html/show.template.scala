
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Note,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(note:Note):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.13*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='"""),_display_(/*6.14*/routes/*6.20*/.Assets.versioned("css/style.css")),format.raw/*6.54*/("""' rel="stylesheet" />
<title>Note """),_display_(/*7.14*/note/*7.18*/.getTitle),format.raw/*7.27*/(""" """),format.raw/*7.28*/("""</title>
</head>
<body>
	<center>
			<h1>Note: """),_display_(/*11.15*/note/*11.19*/.getTitle),format.raw/*11.28*/("""</h1>
			<table>
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Date</th>
					<th>Comment</th>
				</tr>
				<tr>
					<td>"""),_display_(/*20.11*/note/*20.15*/.getId),format.raw/*20.21*/("""</td>
					<td>"""),_display_(/*21.11*/note/*21.15*/.getTitle),format.raw/*21.24*/("""</td>
					<td>"""),_display_(/*22.11*/note/*22.15*/.getDateSQL),format.raw/*22.26*/("""</td>
					<td>"""),_display_(/*23.11*/note/*23.15*/.getComment),format.raw/*23.26*/("""</td>
				</tr>
			</table>
					<hr>
		<a href="../">Home</a>
	</center>
</body>
</html>"""))
      }
    }
  }

  def render(note:Note): play.twirl.api.HtmlFormat.Appendable = apply(note)

  def f:((Note) => play.twirl.api.HtmlFormat.Appendable) = (note) => apply(note)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 23:24:57 CEST 2018
                  SOURCE: C:/Users/Maciej/git/playframework/N10-PlayJava/app/views/show.scala.html
                  HASH: d8be06419864d394897a038a19d8d9e1f02be7f6
                  MATRIX: 945->1|1051->12|1081->16|1205->114|1219->120|1273->154|1335->190|1347->194|1376->203|1404->204|1483->256|1496->260|1526->269|1695->411|1708->415|1735->421|1779->438|1792->442|1822->451|1866->468|1879->472|1911->483|1955->500|1968->504|2000->515
                  LINES: 28->1|33->1|35->3|38->6|38->6|38->6|39->7|39->7|39->7|39->7|43->11|43->11|43->11|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23
                  -- GENERATED --
              */
          