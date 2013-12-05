name := "$name;format="normalize"$"

organization := "$organization$"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
    "com.novocode"              % "junit-interface"           % "0.10"      % "test",
    "junit"                     % "junit"                     % "4.10"     % "test")

publishMavenStyle := true

// do not publish documentation -- source is enough
publishArtifact in packageDoc := false
