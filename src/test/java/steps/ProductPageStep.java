package steps;

import cucumber.api.java.en.And;
import driverClass.DriverClass;
import pages.ProductPage;

public class ProductPageStep extends DriverClass {

    ProductPage productPage = new ProductPage(driver);
    @And("^User can select that product$")
    public void User_can_select_that_product() throws Throwable {
        productPage.User_can_select_that_product();
    }
}
