package steps;

import cucumber.api.java.en.And;
import driverClass.DriverClass;
import pages.AddToKartPage;

public class AddToKartPageStep extends DriverClass {
    AddToKartPage addToKartPage = new AddToKartPage(driver);

    @And("^User can add product to cart$")
    public void User_can_add_product_to_cart() throws Throwable {
        addToKartPage.User_can_add_product_to_cart();
    }
}
