package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
    public static WebDriver driver;

    @Before
    public static void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        //In Windows System - System.setProperty("webdriver.chrome.driver","./src/main/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        this.driver.close();
    }
}
