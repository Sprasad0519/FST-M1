package Project_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class VerifyWebsiteTitle1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");  // Set path to your chromedriver
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://alchemy.hguy.co/lms");

        String title = driver.getTitle();
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);

        driver.quit();
    }
}

