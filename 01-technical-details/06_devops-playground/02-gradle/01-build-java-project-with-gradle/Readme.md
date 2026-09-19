This folder cotains learning example based on the following [guidance](https://docs.gradle.org/current/userguide/part1_gradle_init.html#part1_begin).


# Commands

1. generate a Kotlin project

    ``` shell
    gradle init                 \
    --type java-application     \
    --dsl kotlin

    # Select the Java version 17
    java --version
    ```

2. Build the project

    ``` shell
    ./gradlew build
    ```

3. Run the executable jar

    ``` shell
    java -jar ./app/build/libs/app.jar
    ```
