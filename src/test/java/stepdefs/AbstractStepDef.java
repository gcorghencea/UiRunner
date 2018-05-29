package stepdefs;

import cucumber.api.java.en.Given;

public class AbstractStepDef {

    @Given("I start test")
    public void startTest(){
        System.out.println("Hi");
    }
}
