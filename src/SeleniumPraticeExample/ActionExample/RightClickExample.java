package SeleniumPraticeExample.ActionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.openqa.selenium.devtools.v134.debugger.Debugger.pause;

public class RightClickExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions a = new Actions(driver);
        a.contextClick(RightClick)
        .pause(Duration.ofSeconds(20))
                .perform();
        driver.close();

    }
}
