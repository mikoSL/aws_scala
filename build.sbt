javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

resolvers += Resolver.bintrayIvyRepo("com.eed3si9n", "sbt-plugins")

lazy val root = (project in file(".")).
  settings(
    name := "aws_scala",
    version := "1.0",
    scalaVersion := "2.12.6",
    retrieveManaged := true,
    libraryDependencies ++= Seq(
     "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
     "com.amazonaws" % "aws-lambda-java-events" % "1.0.0",
     "com.amazonaws" % "aws-java-sdk-s3" % "1.11.179"
    )
  )

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
 }
