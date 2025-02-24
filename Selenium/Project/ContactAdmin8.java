package Project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactAdmin8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.linkText("Contact")).click();
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("John Doe");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("john@example.com");
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Test message");
        driver.findElement(By.id("wpforms-8-submit")).click();
        WebElement confirmationMessage = driver.findElement(By.className("wpforms-confirmation-message"));
        System.out.println("Message: " + confirmationMessage.getText());
        driver.quit();
    }
}