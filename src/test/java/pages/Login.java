package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class Login {

    public static String page = "https://www.argos.co.uk/";

    public static String username_locator = "username";

    public static String password_locator = "password";

    public static String submit_btn_locator = "submit";

    public void practice_test(){
        driver.get(page);
    }

    public static void enter_username(){
        driver.findElement(By.id(username_locator)).sendKeys("student");
    }

    public static void enter_password(){
        driver.findElement(By.id(password_locator)).sendKeys("Password123");
    }

    public static void click_submit(){
        driver.findElement(By.id(submit_btn_locator)).click();
    }

}
