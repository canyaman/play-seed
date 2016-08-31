name := """play-seed"""

version := "1.0-SNAPSHOT"

updateOptions := updateOptions.value.withCachedResolution(true)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "com.typesafe.slick" %% "slick-codegen" % "3.1.0",
  "com.typesafe.play" %% "play-slick" % "2.0.2",
  "com.typesafe.play" %% "play-slick-evolutions" % "2.0.2",
  // H2 development database
  "com.h2database" % "h2" % "1.4.192",
  // Mysql production database
  "mysql" % "mysql-connector-java" % "5.1.39",
  // Slack client
  "com.github.gilbertw1" %% "slack-scala-client" % "0.1.7",
  // Core NLP
  "edu.stanford.nlp" % "stanford-corenlp" % "3.6.0",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.6.0" classifier "models",
  "edu.stanford.nlp" % "stanford-parser" % "3.6.0",
  // CoreNLP dependency
  "com.google.protobuf" % "protobuf-java" % "2.6.1",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)