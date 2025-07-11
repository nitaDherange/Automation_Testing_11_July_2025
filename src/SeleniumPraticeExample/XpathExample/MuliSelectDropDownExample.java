package SeleniumPraticeExample.XpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MuliSelectDropDownExample {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement Dropdown = driver.findElement(By.id("multiple-select-example"));

        Select s = new Select(Dropdown);
        Thread.sleep(1000);

        s.selectByIndex(2);
        Thread.sleep(1000);

        s.selectByValue("orange");
        Thread.sleep(1000);

        s.selectByVisibleText("Apple");
        Thread.sleep(1000);

         driver.close();

    }
}



