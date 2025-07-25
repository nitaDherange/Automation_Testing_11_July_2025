package SeleniumPraticeExample.AlertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfSimpleAlert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.id("bmwcheck")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
