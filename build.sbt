name := "canvg.scala.js"
organization := "com.outr"
version := "1.4.0_3"

scalaVersion := "2.13.1"
crossScalaVersions := List("2.13.1", "2.12.8")

publishTo in ThisBuild := sonatypePublishTo.value
sonatypeProfileName in ThisBuild := "com.outr"
publishMavenStyle in ThisBuild := true
licenses in ThisBuild := Seq("MIT" -> url("https://github.com/outr/canvg.scala.js/blob/master/LICENSE"))
sonatypeProjectHosting in ThisBuild := Some(xerial.sbt.Sonatype.GitHubHosting("outr", "canvg.scala.js", "matt@outr.com"))
homepage in ThisBuild := Some(url("https://github.com/outr/canvg.scala.js"))
scmInfo in ThisBuild := Some(
  ScmInfo(
    url("https://github.com/outr/canvg.scala.js"),
    "scm:git@github.com:outr/canvg.scala.js.git"
  )
)
developers in ThisBuild := List(
  Developer(id="darkfrog", name="Matt Hicks", email="matt@matthicks.com", url=url("http://matthicks.com"))
)

enablePlugins(ScalaJSPlugin)
enablePlugins(JSDependenciesPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

jsDependencies += ProvidedJS / "rgbcolor.js"
jsDependencies += ProvidedJS / "StackBlur.js"
jsDependencies += ProvidedJS / "canvg.js"
skip in packageJSDependencies := false
