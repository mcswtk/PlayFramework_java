# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table note (
  id                            uuid not null,
  title                         varchar(255),
  date                          timestamptz,
  comment                       varchar(255),
  constraint pk_note primary key (id)
);


# --- !Downs

drop table if exists note cascade;

