# Cucumber Automation Practice

## Extend report step:

1. Add those dependencies to **pom.xml**

        <dependency>
            <groupId>tech.grasshopper</groupId>
            <artifactId>extentreports-cucumber7-adapter</artifactId>
            <version>1.7.0</version>
        </dependency>

        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>5.0.9</version>
        </dependency>

        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>5.2.2</version>
        </dependency>

        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.2.2</version>
        </dependency>

2. Add [extent-config.xml](https://github.com/sakib-75/Cucumber-Automation-Practice/blob/main/src/main/resources/extent-config.xml) and
3. Add [extent.properties](https://github.com/sakib-75/Cucumber-Automation-Practice/blob/main/src/main/resources/extent.properties) file in resources folder
4. Set proper path of extent.reporter.spark.config file
5. Add plugin in [CucumberTestRunner](https://github.com/sakib-75/Cucumber-Automation-Practice/blob/main/src/test/java/test_runner/CucumberTestRunner.java) </br>
   **`plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
   "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}`**