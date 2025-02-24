package Project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySecondCourseTitle4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/lms");
        WebElement secondCourse = driver.findElement(By.xpath("(//h3[@class='course-title'])[2]"));
        if (secondCourse.getText().equals("Email Marketing Strategies")) {
            System.out.println("Second Course Title verified successfully.");
        } else {
            System.out.println("Second Course Title mismatch.");
        }
        driver.quit();
    }
}