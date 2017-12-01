name := "domoticz-plus"
version := "1.0"
scalaVersion := "2.12.4"

mainClass in assembly := Some("org.bruchez.olivier.domoticzplus.DomoticzPlus")

assemblyJarName in assembly := "domoticz-plus.jar"

scalafmtOnCompile in ThisBuild := true
