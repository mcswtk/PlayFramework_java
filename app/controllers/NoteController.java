package controllers;

import java.util.List;
import java.util.UUID;

import model.Note;
import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class NoteController extends Controller {

  /**
   * An action that renders an HTML page with a welcome message. The configuration
   * in the <code>routes</code> file means that this method will be called when
   * the application receives a <code>GET</code> request with a path of
   * <code>/</code>.
   */

  public Result index() {
    return ok(index.render());
  }

  public Result showAll() {
    List<Note> notes = Note.find.all();
    return ok(notesTable.render(notes));
  }

  public Result show(UUID id) {
    return TODO;
  }

  public Result create() {
    return TODO;
  }

  public Result save() {
    return TODO;
  }
}
