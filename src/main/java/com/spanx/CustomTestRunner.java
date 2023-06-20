package com.spanx;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "com.spanx",
        plugin = {"json:target/cucumber-report.json"}
//        plugin = {"pretty", "html:target/cucumber-html-reports"}
)

public class CustomTestRunner {
    // Ваш класс запуска Cucumber-тестов
}
