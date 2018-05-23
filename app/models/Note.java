package models;

import java.util.Date;
import java.util.UUID;

import io.ebean.*;
import javax.persistence.*;
import play.data.format.*;

@Entity
public class Note extends Model {
  
  @Id
  private UUID id;
  
  private String title;
  
  @Formats.DateTime(pattern="yyyy/MM/dd")
  private Date date;
  
  private String comment;

  public static Finder<UUID, Note> find = new Finder<>(Note.class);

  public Note() {}
  public Note(String title, String comment) {
    this.id = UUID.randomUUID();
    this.title = title;
    this.date = new Date();
    this.comment = comment;
  }

  public UUID getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Date getDate() {
    return date;
  }

  public java.sql.Date getDateSQL() {
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    return sqlDate;
  }

  public String getComment() {
    return comment;
  }   
}
