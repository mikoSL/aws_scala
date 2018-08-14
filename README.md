# aws_scala (lambda demo)

## Modification in build.sbt comparing with its source:
https://aws.amazon.com/blogs/compute/writing-aws-lambda-functions-in-scala/

* Add new libraryDependency:
```
com.amazonaws" % "aws-java-sdk-s3" % "1.11.179
```
* Modify sbt-assembly to

```
assemblyMergeStrategy in assembly := {
```

## Configuration
* Write content in "build.sbt"
* Add a new file "assembly.sbt" in project folder and write:
```
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.7")
```
* Run
```
sbt assembly
```
* Run
```
sbt compile
```
* upload aws_scala_assembly-1.0.jar (directory: ./yourproject/target/scala-2.12/)
* test then run lambda function, check log from cloudwatch.
