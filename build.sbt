val scala3Version = "3.0.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-aoc-2017",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.5" % "test",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.15.3" % "test",
    libraryDependencies += "com.storm-enroute" % "scalameter_2.13" % "0.20" % "test",
    testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework"),
  )
