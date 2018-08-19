package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BaseStep {
    static WebDriver driver;

    public BaseStep() {
        initialize();
    }

    public void initialize() {
        if (null == driver) {
            System.setProperty("webdriver.gecko.driver", "/Users/moniljoshi/Development/gradle-example/src/test/resources/features/geckodriver");
            driver = new FirefoxDriver();
            driver.get("https://www.flipkart.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        // Close the driver instance
        driver.quit();
        driver = null;
        try {
            Runtime.getRuntime().exec("java -jar cucumber-sandwich.jar -f target_json -o build/reports -n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}