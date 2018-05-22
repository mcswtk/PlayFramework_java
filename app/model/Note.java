package model;

import java.util.Date;
import java.util.UUID;

import io.ebean.Finder;
import io.ebean.Model;
import javax.persistence.*;
import play.data.format.*;

@Entity
public class Note extends Model {
  
  @Id
  private UUID id;
  
  private String title;
  
  @Formats.DateTime(pattern="dd/MM/yyyy")
  private Date date;
  
  private String comment;

  public static Finder<UUID, Note> find = new Finder<>(Note.class);
  

/*  public Note(String title, String comment) {
    this.id = UUID.randomUUID();
    this.title = title;
    this.date = new Date();
    this.comment = comment;
  }

  public Note(String id, String title, Date date, String comment) {
    this(title, comment);
    this.id = UUID.fromString(id);
    this.date = date;
  }*/

  /*public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getDate() {
    return date;
  }

  public String getDateAsString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String dateString = dateFormat.format(date);
    return dateString;
  }

  public java.sql.Date getDateSQL() {
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    return sqlDate;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString() {
    return "Note [title=" + title + ", date=" + getDateAsString() + ", comment=" + comment + "]";
  }
   */
}
