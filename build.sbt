lazy val root = (project in file(".")).
  settings(
    name := "fpscala",
    version := "0.0.1",
    scalaVersion := "2.11.8",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )
