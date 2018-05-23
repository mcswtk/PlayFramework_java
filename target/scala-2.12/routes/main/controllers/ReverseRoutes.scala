// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Maciej/git/playframework/N10-PlayJava/conf/routes
// @DATE:Wed May 23 23:24:57 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseNoteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def showAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notes/all")
    }
  
    // @LINE:7
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notes/create")
    }
  
    // @LINE:8
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "notes/create")
    }
  
    // @LINE:9
    def show(id:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
