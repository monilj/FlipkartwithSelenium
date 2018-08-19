package steps;

import cucumber.api.java.en.Then;
import driverClass.DriverClass;
import pages.ComparePage;

public class ComparePageStep extends DriverClass {

    ComparePage comparePage = new ComparePage(driver);
    @Then("^User should redirect to Compare page$")
    public void user_should_redirect_to_Compare_page() throws Throwable {
        comparePage.user_should_redirect_to_Compare_page();
    }
}
