// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Maciej/git/playframework/N10-PlayJava/conf/routes
// @DATE:Wed May 23 23:24:57 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  NoteController_1: controllers.NoteController,
  // @LINE:12
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    NoteController_1: controllers.NoteController,
    // @LINE:12
    Assets_0: controllers.Assets
  ) = this(errorHandler, NoteController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, NoteController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.NoteController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes/all""", """controllers.NoteController.showAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes/create""", """controllers.NoteController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes/create""", """controllers.NoteController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes/""" + "$" + """id<[^/]+>""", """controllers.NoteController.show(id:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_NoteController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_NoteController_index0_invoker = createInvoker(
    NoteController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_NoteController_showAll1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes/all")))
  )
  private[this] lazy val controllers_NoteController_showAll1_invoker = createInvoker(
    NoteController_1.showAll(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteController",
      "showAll",
      Nil,
      "GET",
      this.prefix + """notes/all""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_NoteController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes/create")))
  )
  private[this] lazy val controllers_NoteController_create2_invoker = createInvoker(
    NoteController_1.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteController",
      "create",
      Nil,
      "GET",
      this.prefix + """notes/create""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_NoteController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes/create")))
  )
  private[this] lazy val controllers_NoteController_save3_invoker = createInvoker(
    NoteController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteController",
      "save",
      Nil,
      "POST",
      this.prefix + """notes/create""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_NoteController_show4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoteController_show4_invoker = createInvoker(
    NoteController_1.show(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteController",
      "show",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """notes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_NoteController_index0_route(params@_) =>
      call { 
        controllers_NoteController_index0_invoker.call(NoteController_1.index())
      }
  
    // @LINE:6
    case controllers_NoteController_showAll1_route(params@_) =>
      call { 
        controllers_NoteController_showAll1_invoker.call(NoteController_1.showAll())
      }
  
    // @LINE:7
    case controllers_NoteController_create2_route(params@_) =>
      call { 
        controllers_NoteController_create2_invoker.call(NoteController_1.create())
      }
  
    // @LINE:8
    case controllers_NoteController_save3_route(params@_) =>
      call { 
        controllers_NoteController_save3_invoker.call(NoteController_1.save())
      }
  
    // @LINE:9
    case controllers_NoteController_show4_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        controllers_NoteController_show4_invoker.call(NoteController_1.show(id))
      }
  
    // @LINE:12
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
