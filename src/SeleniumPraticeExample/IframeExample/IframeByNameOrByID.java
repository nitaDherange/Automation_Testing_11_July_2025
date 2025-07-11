package SeleniumPraticeExample.IframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeByNameOrByID {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/frames");
        Driver.manage().window().maximize();
         Driver.switchTo().frame("frame1");
        String name= Driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(name);
        Driver.close();

    }
}
