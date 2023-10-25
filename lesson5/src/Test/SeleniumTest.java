package Test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    @Test
    void seleniumTest(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/mafaka03/Downloads/chromedriver-mac-x64/chromedriver");
        //SafariOptions options = new SafariOptions();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Selenium");
        search.submit();
        List<WebElement> searchList = driver.findElements(By.cssSelector("div"));
        boolean isFind = false;
        for (WebElement we:searchList) {
            if (we.getText().contains("https://www.selenium.dev")) {
                isFind = true;
                break;
            }
        }
        assertTrue(isFind);
        driver.quit();

    }
    @Test
    void seleniumTestSauceDemo(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/mafaka03/Downloads/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement buttonField = driver.findElement(By.id("login-button"));

        userNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        buttonField.click();
        WebElement titleField = driver.findElement(By.className("title"));
        assertEquals(titleField.getText(), ("Products"));
        driver.quit();

    }
}
