package SeleniumPraticeExample.IframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IFrameExample2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

      List<WebElement> IframeElement =driver.findElements(By.tagName("iframe"));
        System.out.println("IframeElement are:" +IframeElement.size());
        driver.close();
    }
}
