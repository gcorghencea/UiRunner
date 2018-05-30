package stepdefs;

import context.ScenarioContext;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class AbstractStepDef {

    ScenarioContext scenarioContext;

    @Given("I start test")
    public void startTest(){
        WebDriver driver = (WebDriver) scenarioContext.getContext("driver");
        driver.get("www.google.com");
        System.out.println(driver.getCurrentUrl());
    }
}
