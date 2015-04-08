name := """devstats"""

version := "1.0"

scalaVersion := "2.10.4"

resolvers += Resolver.bintrayRepo("scalaz", "releases")
resolvers += "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/"

// Change this to another test framework if you prefer
libraryDependencies += "org.gitlab" % "java-gitlab-api" % "1.1.4"
libraryDependencies += "org.specs2" % "specs2-core_2.10" % "3.3.1" % "test"
libraryDependencies += "org.scalamock" %% "scalamock-specs2-support" % "3.2.1" % "test"


// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

