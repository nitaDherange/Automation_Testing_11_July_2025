package SeleniumPraticeExample.WindowHandele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.findElement(By.id("openwindow")).click();

        String ParentWindowID = driver.getWindowHandle();
       Set<String> AllWindowID =driver.getWindowHandles();

       for(String s :AllWindowID){
           if (!s.contentEquals(ParentWindowID)){
               driver.switchTo().window(s);
               Thread.sleep(2000);
               driver.findElement(By.linkText("BLOG")).click();
               Thread.sleep(2000);
               System.out.println(driver.getTitle());
               Thread.sleep(2000);
               driver.close();
               Thread.sleep(2000);
           }
       }
       driver.switchTo().window(ParentWindowID);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
