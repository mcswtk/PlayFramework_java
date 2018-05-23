
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

object notesTable extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Note],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(notes : List[Note]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='"""),_display_(/*6.14*/routes/*6.20*/.Assets.versioned("css/style.css")),format.raw/*6.54*/("""' rel="stylesheet" />
<title>All Notes</title>
</head>
<body>
	<center>
			<h1>All Notes</h1>
			<table>
				<tr>
					<th>Id</th>
					<th>Date</th>
				</tr>
				"""),_display_(/*17.6*/for(note <- notes) yield /*17.24*/{_display_(Seq[Any](format.raw/*17.25*/("""
				"""),format.raw/*18.5*/("""<tr>
					<td><a href=""""),_display_(/*19.20*/routes/*19.26*/.NoteController.show(note.getId)),format.raw/*19.58*/("""">"""),_display_(/*19.61*/note/*19.65*/.getId),format.raw/*19.71*/("""</a></td>
					<td>"""),_display_(/*20.11*/note/*20.15*/.getDateSQL),format.raw/*20.26*/("""</td>
				</tr>
				""")))}),format.raw/*22.6*/("""
			"""),format.raw/*23.4*/("""</table>
					<hr>
		<a href="../">Home</a>
	</center>
</body>
</html>"""))
      }
    }
  }

  def render(notes:List[Note]): play.twirl.api.HtmlFormat.Appendable = apply(notes)

  def f:((List[Note]) => play.twirl.api.HtmlFormat.Appendable) = (notes) => apply(notes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 23:24:57 CEST 2018
                  SOURCE: C:/Users/Maciej/git/playframework/N10-PlayJava/app/views/notesTable.scala.html
                  HASH: 366e87b96e1b1f6719b20dcbcc54d01218170e76
                  MATRIX: 957->1|1072->21|1102->25|1226->123|1240->129|1294->163|1496->339|1530->357|1569->358|1602->364|1654->389|1669->395|1722->427|1752->430|1765->434|1792->440|1840->461|1853->465|1885->476|1938->499|1970->504
                  LINES: 28->1|33->1|35->3|38->6|38->6|38->6|49->17|49->17|49->17|50->18|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|54->22|55->23
                  -- GENERATED --
              */
          