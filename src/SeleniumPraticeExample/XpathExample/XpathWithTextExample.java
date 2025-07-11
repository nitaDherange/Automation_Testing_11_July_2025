package SeleniumPraticeExample.XpathExample;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithTextExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String HeadingText =  driver.findElement(By.xpath("//h2[text()='Sign in']")).getText();
         System.out.println("HeadingText:" +HeadingText);

        Thread.sleep(1000);
        driver.close();
    }
}
