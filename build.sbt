scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
libraryDependencies += "com.github.scopt" %% "scopt" % "3.3.0"
libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % "3.2" % "test"

resolvers += Resolver.sonatypeRepo("public")
