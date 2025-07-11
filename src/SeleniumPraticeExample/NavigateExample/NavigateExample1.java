package SeleniumPraticeExample.NavigateExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Get a new Rediffmail ID")).click();
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();
    }
}
