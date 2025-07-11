package SeleniumPraticeExample.ScrollUpAndDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDownByElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement e = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",e);
        Thread.sleep(2000);

        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        Thread.sleep(2000);

        driver.close();
    }
}
