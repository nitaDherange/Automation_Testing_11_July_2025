package SeleniumPraticeExample.ActionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

public class ActionExample1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        WebElement ElementA = driver.findElement(By.xpath("//li[text()='A']"));

        Actions a = new Actions(driver);
        a.clickAndHold(ElementA)
                .pause(Duration.ofSeconds(20))
                .perform();
        
        driver.();

        }







    }


