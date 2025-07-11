package SeleniumPraticeExample.XpathExample;

import com.sun.tools.javac.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement Textbox = driver.findElement(By.id("enabled-example-input"));
        WebElement EnableButton = driver.findElement(By.id("enabled-button"));
        WebElement DisableButton = driver.findElement(By.id("disabled-button"));

        System.out.println(Textbox.isEnabled());
        DisableButton.click();
        System.out.println(Textbox.isEnabled());
        EnableButton.click();
        System.out.println(Textbox.isEnabled());
        driver.close();
    }

}
