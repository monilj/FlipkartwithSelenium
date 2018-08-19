package driverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;


public class DriverClass {
   public static WebDriver driver;




    public void initialize() {
        if (null == driver) {
            System.setProperty("webdriver.gecko.driver", "/Users/monilj/Downloads/flipkartfromscratch/src/test/resources/driver/geckodriver");
            driver = new FirefoxDriver();
//            File file = new File("/Users/moniljoshi/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
//            System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
//            PhantomJSDriver driver = new PhantomJSDriver();

        }
    }

//    public WebDriver getDriver() {
//        return driver;
//    }

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
