package Project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.id("username")).sendKeys("root");
        driver.findElement(By.id("password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("login")).click();
        if (driver.getTitle().contains("Dashboard")) {
            System.out.println("Successfully logged in.");
        } else {
            System.out.println("Login failed.");
        }
        driver.quit();
    }
}
