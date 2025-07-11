package SeleniumPraticeExample.XpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement textbox = driver.findElement(By.id("displayed-text"));
        WebElement ShowBtn = driver.findElement(By.id("show-textbox"));
        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));

        System.out.println(textbox.isDisplayed());
        hideBtn.click();
        System.out.println(textbox.isDisplayed());
        ShowBtn.click();
        System.out.println(textbox.isDisplayed());

        Thread.sleep(1000);
        driver.close();

    }
}
