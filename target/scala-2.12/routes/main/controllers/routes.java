// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Maciej/git/playframework/N10-PlayJava/conf/routes
// @DATE:Wed May 23 23:24:57 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseNoteController NoteController = new controllers.ReverseNoteController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseNoteController NoteController = new controllers.javascript.ReverseNoteController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
