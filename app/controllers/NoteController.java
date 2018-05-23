package controllers;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import models.Note;
import play.data.*;
import play.mvc.*;


public class NoteController extends Controller {

  @Inject
  FormFactory formFactory;
  
  public Result index() {
    return ok(views.html.index.render());
  }

  public Result showAll() {
    List<Note> notes = Note.find.all();
    return ok(views.html.notesTable.render(notes));
  }

  public Result show(UUID id) {
    Note note = Note.find.byId(id);
    if(note==null)
      return notFound("Note not found");
    return ok(views.html.show.render(note));
  }

  public Result create() {
    Form<Note> noteForm = formFactory.form(Note.class);
    return ok(views.html.create.render(noteForm));
  }

  public Result save() {
//    Form<Note> noteForm = formFactory.form(Note.class).bindFromRequest();
    DynamicForm requestData = formFactory.form().bindFromRequest();
    String title = requestData.get("title");
    String comment = requestData.get("comment");
    Note note = new Note(title, comment);
    note.save();
    return redirect(routes.NoteController.showAll());
  }
}