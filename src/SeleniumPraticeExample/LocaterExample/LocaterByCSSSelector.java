package SeleniumPraticeExample.LocaterExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterByCSSSelector {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.cssSelector("input#login1")).sendKeys("Nita Dherange");
        Thread.sleep(1000);
        driver.close();
    }
}
