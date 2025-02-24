package Project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class VerifyWebsiteHeading2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");  // Set path to your chromedriver
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://alchemy.hguy.co/lms");
        
        String heading = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Learn from Experts", heading);

        driver.quit();
    }
}

