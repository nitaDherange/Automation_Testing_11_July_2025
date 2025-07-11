package SeleniumPraticeExample.ScrollUpAndDown;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpByPixel {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        JavascriptExecutor js =  ( JavascriptExecutor ) driver;
        js.executeScript("window.scrollBy(0,2500)");
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,-2500) ");
        Thread.sleep(3000);

        driver.close();

        }
}
