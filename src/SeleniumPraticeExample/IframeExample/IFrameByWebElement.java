package SeleniumPraticeExample.IframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameByWebElement {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/frames");
        Driver.manage().window().maximize();
      WebElement frameElement= Driver.findElement(By.xpath("//iframe[@id='frame1']"));
      Driver.switchTo().frame(frameElement);
        String name= Driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(name);
        Driver.close();
    }
}
