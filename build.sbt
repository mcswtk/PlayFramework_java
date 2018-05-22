name := """N11-PlayJava"""
organization := "com.mcswtk"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies += "org.postgresql" % "postgresql" % "42.1.4"
libraryDependencies += "javax.servlet" % "jstl" % "1.2"
libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1"


