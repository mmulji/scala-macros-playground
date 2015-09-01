scalaVersion := "2.11.5"
name := "scala-macros-playground"
version := "1.0"

lazy val root = (project in file(".")).aggregate(macros, examples)
lazy val macros = project.in(file("modules/macros"))
lazy val examples = project.in(file("modules/examples")).dependsOn(macros)
