
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
<title>All Notes</title>
</head>
<body>
	<h1>All Notes</h1>
	<table>
		<tr>
			<th>Title</th>
			<th>Date</th>
		</tr>
		"""),_display_(/*15.4*/for(note <- notes) yield /*15.22*/{_display_(Seq[Any](format.raw/*15.23*/(""" 
		"""),format.raw/*16.3*/("""<tr>
		<td>"""),_display_(/*17.8*/note/*17.12*/.title),format.raw/*17.18*/("""</td>
		<td>"""),_display_(/*18.8*/note/*18.12*/.date),format.raw/*18.17*/("""</td>
		</tr>
		""")))}),format.raw/*20.4*/("""
		"""),format.raw/*21.3*/("""</table>
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
                  DATE: Tue May 22 21:59:25 CEST 2018
                  SOURCE: E:/Programy/JavaWorkspace/playframework/n11-playjava/app/views/notesTable.scala.html
                  HASH: 47a66c768454e97808db3503fa0a9774f33fdd4c
                  MATRIX: 957->1|1072->21|1102->25|1344->241|1378->259|1417->260|1449->265|1488->278|1501->282|1528->288|1568->302|1581->306|1607->311|1656->330|1687->334
                  LINES: 28->1|33->1|35->3|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|50->18|50->18|52->20|53->21
                  -- GENERATED --
              */
          