package SeleniumPraticeExample;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        List<WebElement> allLinks   = driver.findElements(By.tagName("input"));
        System.out.println(allLinks.size());
        for(WebElement e : allLinks){
            System.out.println(e);

        }

        Thread.sleep(2000);
        driver.close();
    }
}
