package Project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CountCourses7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.linkText("All Courses")).click();
        List<WebElement> courses = driver.findElements(By.className("course"));
        System.out.println("Number of courses: " + courses.size());
        driver.quit();
    }
}


