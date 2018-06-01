package hooks;

import context.ScenarioContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import factory.DriverManager;
import factory.DriverManagerFactory;
import factory.DriverType;

public class GlobalHooks {

    private DriverManager driverManager;
    private ScenarioContext scenarioContext;

    @Before
    public void beforeScenario() {
        scenarioContext.setContext("driverManager", DriverManagerFactory.getManager(DriverType.CHROME));
        scenarioContext.setContext("driver", DriverManagerFactory.getManager(DriverType.CHROME).getDriver());
    }

    @After
    public void afterScenario() {
        driverManager = (DriverManager) scenarioContext.getContext("driverManager");
        driverManager.quitDriver();
    }

}
