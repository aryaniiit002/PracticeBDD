# PracticeBDD
## BDD - [Behaviour Driven Development](https://en.wikipedia.org/wiki/Behavior-driven_development)


This is a practice (GSoC' 2021) [Project of BDD](https://github.com/checkstyle/checkstyle/wiki/Checkstyle-GSoC-2021-Project-Ideas#project-name-adaptation-of-behavior-driven-development-ideas-for-testing-of-source-code-validation-algorithms) for [Checkstyle](https://checkstyle.org/).

Here I have used [Cucumber](https://cucumber.io/docs/guides/10-minute-tutorial/) for doing BDD, jUnit for doing the unit testing and Maven for the project build.


### Terminal Output -

```
aryaniiit002@ENIAC:~/Desktop/PracticeBDD$ mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< hellocucumber:hellocucumber >---------------------
[INFO] Building hellocucumber 1.0.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ hellocucumber ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/aryaniiit002/Desktop/PracticeBDD/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ hellocucumber ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ hellocucumber ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ hellocucumber ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ hellocucumber ---
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
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.658 sec
Running javabdd.banking.BankingTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec

Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.068 s
[INFO] Finished at: 2021-04-06T13:26:03+05:30
[INFO] ------------------------------------------------------------------------
```
