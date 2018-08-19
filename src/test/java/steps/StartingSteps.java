package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import driverClass.DriverClass;

import java.util.concurrent.TimeUnit;


public class StartingSteps extends DriverClass {

    @Before
    public void beforeScenario() {
        if (null == driver) {
            initialize();
        }
    }

    @Given("^User opens flipkart in firefox$")
    public void User_opens_flipkart_in_firefox() {
        System.out.println("Given   .......");
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void afterScenario(Scenario scenario) {
        if (null != driver) {
            destroyDriver();
        }
    }
}
