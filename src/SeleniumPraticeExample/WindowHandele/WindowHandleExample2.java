package SeleniumPraticeExample.WindowHandele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();
       String ParentWidowID =driver.getWindowHandle();
        Set<String> AllWindowID =driver.getWindowHandles();

        for(String s : AllWindowID){
            if(!s.contentEquals(ParentWidowID)){
                driver.switchTo().window(s);
                Thread.sleep(2000);
                driver.findElement(By.linkText("BLOG")).click();
                System.out.println(driver.getTitle());
                driver.close();
            }

        }
        driver.switchTo().window(ParentWidowID);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
