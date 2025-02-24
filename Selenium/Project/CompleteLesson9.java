package Project_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteLesson9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.linkText("All Courses")).click();
        driver.findElement(By.cssSelector(".course-button")).click();  // Example: Open a course
        driver.findElement(By.xpath("//a[@class='lesson-link']")).click();  // Select a lesson
        driver.findElement(By.xpath("//button[text()='Mark Complete']")).click();  // Click "Mark Complete" button
        driver.quit();
    }
}

