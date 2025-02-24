package Project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class VerifyFirstInfoBoxTitle3 {
    public static void main(String[] args) {
        // Set the path for your WebDriver (ChromeDriver in this case)
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");  // Update path as necessary
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the Alchemy LMS website
        driver.get("https://alchemy.hguy.co/lms");
        
        // Get the title of the first info box
        WebElement firstInfoBoxTitle = driver.findElement(By.cssSelector(".elementor-widget-container h3"));  // Adjust the selector if necessary

        // Get the text of the title and compare it to the expected value
        String titleText = firstInfoBoxTitle.getText();
        Assert.assertEquals("Actionable Training", titleText);

        // If it matches, close the browser
        System.out.println("Title matches: " + titleText);
        
        // Close the browser
        driver.quit();
    }
}

