package Project_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class NavigateToPage5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.linkText("My Account")).click();
        if (driver.getTitle().contains("My Account")) {
            System.out.println("Successfully navigated to My Account page.");
        } else {
            System.out.println("Navigation failed.");
        }
        driver.quit();
    }
}
