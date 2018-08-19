package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToKartPage extends BasePage {

//    @FindBy(xpath = "//button[contains(text(), 'ADD TO CART')]")
    @FindBy(xpath = "//button[contains(@class, '_2AkmmA _2Npkh4 _2MWPVK')]")
    private WebElement perticularProduct;

    public AddToKartPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void User_can_add_product_to_cart() throws Throwable {
        perticularProduct.click();
        System.out.println("Product Added to kart sucessfully");
    }
}
