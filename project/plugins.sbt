updateOptions := updateOptions.value.withCachedResolution(true)

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.6")

// Package plugin
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")

// BuildInfo plugin
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.6.1")

// Scala Formatter plugin
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "0.3.1")

// Native artifact fetch
//addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14")