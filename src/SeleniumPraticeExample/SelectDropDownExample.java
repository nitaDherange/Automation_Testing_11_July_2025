package SeleniumPraticeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement Dropdown = driver.findElement(By.id("carselect"));

        Select s = new Select(Dropdown);
        Thread.sleep(1000);

        s.selectByIndex(2);
        Thread.sleep(1000);

        s.selectByValue("benz");
        Thread.sleep(1000);

        s.selectByVisibleText("BMW");
        Thread.sleep(1000);

        driver.close();
    }
}