# PracticeBDD
#### BDD - [Behaviour Driven Development](https://en.wikipedia.org/wiki/Behavior-driven_development)
#### Google Truth - [Truth](https://truth.dev/) is a library for performing assertions in tests


This is a practice project of  [Project of BDD](https://github.com/checkstyle/checkstyle/wiki/Checkstyle-GSoC-2021-Project-Ideas#project-name-adaptation-of-behavior-driven-development-ideas-for-testing-of-source-code-validation-algorithms) and [Truth](https://github.com/google/truth) for [Checkstyle](https://checkstyle.org/) for GSoC' 2021.

Here I have used [Cucumber](https://cucumber.io/docs/guides/10-minute-tutorial/) for doing BDD, jUnit for doing the unit testing, also used Google truth for separate testing and Maven for the project build.      

### Terminal Output :

```
aryaniiit002@ENIAC:~/Desktop/PracticeBDD$ mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------< BDD:BDD >-------------------------------
[INFO] Building BDD 1.0.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ BDD ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/aryaniiit002/Desktop/PracticeBDD/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ BDD ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ BDD ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ BDD ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 6 source files to /home/aryaniiit002/Desktop/PracticeBDD/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ BDD ---
[INFO] Surefire report directory: /home/aryaniiit002/Desktop/PracticeBDD/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running javabdd.RunCucumberTest

Scenario: Withdraw amount safely                   # javabdd/withdraw.feature:3
  Given Account balance is "1000"                  # javabdd.StepDefinitions.isAccountBalanceNotZero(java.lang.String)
  When Minimum account balance maintained is "500" # javabdd.StepDefinitions.isMinBalanceMaintained(java.lang.String)
  Then Successfully withdraw "100"                 # javabdd.StepDefinitions.withdrawBalance(java.lang.String)

Scenario: Withdraw amount unsafely                 # javabdd/withdraw.feature:8
  Given Account balance is "1000"                  # javabdd.StepDefinitions.isAccountBalanceNotZero(java.lang.String)
  When Minimum account balance maintained is "500" # javabdd.StepDefinitions.isMinBalanceMaintained(java.lang.String)
  Then Successfully withdraw "50"                  # javabdd.StepDefinitions.withdrawBalance(java.lang.String)
┌───────────────────────────────────────────────────────────────────────────────────┐
│ Share your Cucumber Report with your team at https://reports.cucumber.io          │
│ Activate publishing with one of the following:                                    │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.enabled=true    │
│ src/test/resources/junit-platform.properties:    cucumber.publish.enabled=true    │
│ Environment variable:                            CUCUMBER_PUBLISH_ENABLED=true    │
│ JUnit:                                           @CucumberOptions(publish = true) │
│                                                                                   │
│ More information at https://reports.cucumber.io/docs/cucumber-jvm                 │
│                                                                                   │
│ Disable this message with one of the following:                                   │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.quiet=true      │
│ src/test/resources/junit-platform.properties:    cucumber.publish.quiet=true      │
└───────────────────────────────────────────────────────────────────────────────────┘
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.68 sec
Running javabdd.banking.BankingTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running truth.GoogleTruthUnitTest
Tests run: 69, Failures: 0, Errors: 0, Skipped: 3, Time elapsed: 0.124 sec

Results :

Tests run: 72, Failures: 0, Errors: 0, Skipped: 3

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.084 s
[INFO] Finished at: 2021-04-06T15:50:34+05:30
[INFO] ------------------------------------------------------------------------

```
