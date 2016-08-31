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
// addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14")

// web plugins

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.7")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.1.0")

addSbtPlugin("org.irundaia.sbt" % "sbt-sassify" % "1.4.2")

