lazy val root =
  (project in file(".")).
  settings(
    name := "libets",
    organization := "reinheimer.steve",
    version := "1.0-SNAPSHOT",
    autoScalaLibrary := false,
    publishMavenStyle := true,
    libraryDependencies ++= Nil
  )
