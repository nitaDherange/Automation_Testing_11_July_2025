package SeleniumPraticeExample.ActionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.openqa.selenium.devtools.v134.debugger.Debugger.pause;

public class DoubleClickExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();

     WebElement rightElement  = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));

     Actions a = new Actions(driver);
     a.doubleClick(rightElement)
        .pause(Duration.ofSeconds(20))
                .perform();
        driver.close();
    }
}
