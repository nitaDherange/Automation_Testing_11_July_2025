package SeleniumPraticeExample.XpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement RadioBtn = driver.findElement(By.id("benzradio"));
        System.out.println(RadioBtn.isSelected());//False
        RadioBtn.click();//True
        System.out.println(RadioBtn.isSelected());
        Thread.sleep(1000);
        driver.close();
    }
}
