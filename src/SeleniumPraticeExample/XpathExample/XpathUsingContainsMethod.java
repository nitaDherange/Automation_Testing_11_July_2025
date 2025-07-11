package SeleniumPraticeExample.XpathExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContainsMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[contains (@name,'pas')]")).sendKeys("Nita@123");
        Thread.sleep(1000);
        driver.close();
    }
}
