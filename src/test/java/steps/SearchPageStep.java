package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import driverClass.DriverClass;
import pages.SearchPage;

public class SearchPageStep extends DriverClass {
    SearchPage searchPage = new SearchPage(driver);

    @Then("^User should get that product in search results$")
    public void User_should_get_that_product_in_seatch_results() throws Throwable {
        searchPage.User_should_get_that_product_in_seatch_results();
    }

    @And("^Click on COMPARE$")
    public void click_on_COMPARE() throws Throwable {
        searchPage.click_on_COMPARE();
    }

    @And("^Checked checkbox Add to Compare for (\\d+) and (\\d+)$")
    public void checked_checkbox_Add_to_Compare_for(int i, int j) throws Throwable {
        searchPage.checked_checkbox_Add_to_Compare_for(i, j);
    }

}