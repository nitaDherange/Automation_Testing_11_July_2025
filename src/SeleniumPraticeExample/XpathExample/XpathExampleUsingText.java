package SeleniumPraticeExample.XpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExampleUsingText {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      WebElement Element =driver.findElement(By.xpath("//a[starts-with(text(),'Get a new')]"));
        System.out.println("Text for website." +Element);

        Thread.sleep(1000);
        driver.close();
    }
}
