package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Showing')]")
    private WebElement resulttext;

    @FindBys({@FindBy(xpath = "//span[contains(.,'Add to Compare')]")})
    List<WebElement> productcheckboxes;

    @FindBy(xpath = "//span[contains(text(),'COMPARE')]")
    private WebElement buttonCompare;

    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void User_should_get_that_product_in_seatch_results() throws Throwable {
        waitForElementToBevisible(resulttext);
        String gt = resulttext.getText();
        //TODO: use assertions
        assertThat(gt, containsString("Showing"));
    }

    public void checked_checkbox_Add_to_Compare_for(int i, int j) {
        waitForElementToBevisible(resulttext);
        productcheckboxes.get(i).click();
        System.out.println("User checked 1st product");
        productcheckboxes.get(j).click();
        System.out.println("user checked 2nd product");
        //should be in search page
        waitForElementToBevisible(buttonCompare);
    }

    public void click_on_COMPARE() throws Throwable {
        buttonCompare.click();
        System.out.println("user clicked on COMPARE keyword");

    }
}
