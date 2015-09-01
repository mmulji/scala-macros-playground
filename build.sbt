scalaVersion := "2.11.5"

name := "scala-macros-playground"

version := "1.0"

lazy val root = (project in file(".")).aggregate(bizz, macros, examples)
lazy val bizz = project.in(file("modules/bizz"))
lazy val macros = project.in(file("modules/macros")).dependsOn(bizz)
lazy val examples = project.in(file("modules/examples")).dependsOn(macros)