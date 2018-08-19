package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import driverClass.DriverClass;
import pages.HomePage;

public class HomePageStep extends DriverClass {

    HomePage homePage = new HomePage(driver);

    @When("^when user search for \"([^\"]*)\"$")
    public void when_user_search_for(String mobileName) throws Throwable {
        homePage.searchFor(mobileName);
    }

    @When("^User mouse hover on \"([^\"]*)\"$")
    public void user_mouse_hover_on(String top_menu) throws Throwable {
        homePage.user_mouse_hover_on(top_menu);
    }

    @And("^Click on \"([^\"]*)\"$")
    public void click_on_(String sub_menu) throws Throwable {
        homePage.click_on(sub_menu);
    }

    @When("^when user searches for (.*)$")
    public void whenUserSearchForMobileName(String mobileName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.searchFor(mobileName);
    }
}