package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    @FindBy(xpath = "//input[contains(@placeholder, 'Search for Products, Brands and More')]")
    private WebElement searchbox;

    @FindBy(xpath = "//button[@class='vh79eN'][@type='submit']")
    private WebElement searchsymbol;

    //    @FindBy(xpath = "//span[contains(text(), 'Electronics')]")
    @FindBy(xpath = "//a[@class='_1QZ6fC'][@title='Electronics']")

    private WebElement electronicsTopmenu;


    @FindBy(xpath = "//span[contains(text(), 'DSLR')]")
    private WebElement dslrLink;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchFor(String mobileName) throws Throwable {
        waitForElementToBevisible(searchbox);
        searchbox.sendKeys(mobileName + "in mobile");
        searchsymbol.click();
    }

    public void user_mouse_hover_on(String top_menu) throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(electronicsTopmenu).build().perform();
        waitForElementToBevisible(dslrLink);
        //should be in HomePage
    }

    public void click_on(String sub_menu) throws Throwable {
        dslrLink.click();
        System.out.println("User clicked on " + sub_menu);
        //should be in HomePage

    }

}
