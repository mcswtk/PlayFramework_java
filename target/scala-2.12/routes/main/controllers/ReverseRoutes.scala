// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Programy/JavaWorkspace/playframework/n11-playjava/conf/routes
// @DATE:Tue May 22 21:52:19 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseNoteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def showAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notes/all")
    }
  
    // @LINE:8
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notes/create")
    }
  
    // @LINE:9
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "notes/create")
    }
  
    // @LINE:10
    def show(id:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
