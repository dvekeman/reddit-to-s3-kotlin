# Reddit To S3: Kotlin

A demo application to fetch data from Reddit and upload it into an S3 bucket

## Prerequisites

## Running the demo

Building is easy:

```
./gradlew build
```

This builds a runnable jar which can be executed from the project root directory as:

```
java -jar build/libs/reddit-to-s3-kotlin-0.0.1.jar -t Kotlin -b reddit2s3
```

The application can also be run directly from gradle, however there is a small quirk for the command line args as the
gradle application plugin doesn't support this natively. In the gradle buildscript we've foreseen an 'appArgs' argument
which does the trick.

To run from gradle

```
./gradlew run -PappArgs="['-t', 'Kotlin', '-b', 'reddit2s3']"
```

The output should be something like

To run from the jar



```
Uploading a new object to S3 from a file

Stored comments from https://www.reddit.com/r/Kotlin/comments/.json in S3 bucket reddit2s3
```