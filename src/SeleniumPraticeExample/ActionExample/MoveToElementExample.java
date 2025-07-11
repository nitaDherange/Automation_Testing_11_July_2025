package SeleniumPraticeExample.ActionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MoveToElementExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

       WebElement MouseOver =driver.findElement(By.id("//span[text()='Login']"));

       Actions a = new Actions(driver);
        a.moveToElement(MouseOver)
                .pause(Duration.ofSeconds(20))
                .perform();
        driver.close();


    }
}
