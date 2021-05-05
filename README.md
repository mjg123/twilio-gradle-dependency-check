# twilio-gradle-dependency-check

Demo project showing how to include a dependency on the [Twilio Java Helper](https://www.twilio.com/docs/libraries/java) using Gradle.

## What's here?

A brand new Gradle project with [the Twilio dependency added](https://github.com/mjg123/twilio-gradle-dependency-check/blob/main/app/build.gradle#L26-L27) and [used in code](https://github.com/mjg123/twilio-gradle-dependency-check/blob/main/app/src/main/java/com/example/twilio/gradle/App.java#L17-L21).

## How do I use it?

Set `TWILIO_ACCOUNT_SID` and `TWILIO_AUTH_TOKEN` as environment variables. In the root of the directory, run `./gradlew run`:

```
mjg$ ./gradlew run 

> Task :app:run
Twilio init
Hello World!

BUILD SUCCESSFUL in 564ms
2 actionable tasks: 1 executed, 1 up-to-date
```

The app doesn't do anything useful, but serves as a demonstration of how to add the Twilio dependency and import some classes into code that is compiled and executed.

## What else can I see?

You can ask Gradle to show you all the dependencies which are available in the project:

```
mjg/$ cd app
mjg/app$ ../gradlew dependencies

> Task :app:dependencies

------------------------------------------------------------
Project ':app'
------------------------------------------------------------

......
```
There is a lot more output here which I've truncated. You will see lines containing `com.twilio.sdk:twilio:8.11.0` a few times, showing that the dependency is available at different stages of the build.
