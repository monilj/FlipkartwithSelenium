package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class ComparePage extends BasePage {
    @FindBy(xpath = "//span[contains(text(), 'Compare')]")
    private WebElement oncomparePage;

    public ComparePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void user_should_redirect_to_Compare_page() throws Throwable {
            waitForElementToBevisible(oncomparePage);
        String comp = oncomparePage.getText();
        assertThat(comp, containsString("Compare"));


    }

}
