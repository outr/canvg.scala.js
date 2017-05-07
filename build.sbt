name := "canvg.scala.js"
organization := "com.outr"
version := "1.4.0_1-SNAPSHOT"

scalaVersion := "2.12.2"
crossScalaVersions := List("2.12.2", "2.11.11")

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

jsDependencies += ProvidedJS / "rgbcolor.js"
jsDependencies += ProvidedJS / "StackBlur.js"
jsDependencies += ProvidedJS / "canvg.js"
skip in packageJSDependencies := false