##Steps to run

1. Clone Repo: `git clone https://github.com/UmangSardesai/geb-concurrent-example-gradle.git`

2. Add your username and automate-key to the `./build.gradle` and `./src/test/resources/GebConfig.groovy`.

3. Execute tests sequentially: `./gradlew clean allBrowserStackTests`

4. Execute tests in parallel: `./gradlew clean allBrowserStackTests --parallel`
