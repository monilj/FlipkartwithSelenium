package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(className="_1UoZlX")
    List<WebElement> allElements;


    public ProductPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void User_can_select_that_product() throws InterruptedException {
        allElements.get(0).click();
    }
}
