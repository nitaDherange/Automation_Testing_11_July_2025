package SeleniumPraticeExample.XpathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class XpathFollowing {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
            driver.get("https://www.flipkart.com/");
     List<WebElement> allElement = driver.findElements(By.xpath("//span[text()='Login']//following::li//text()"));
     for (WebElement e:allElement){
         System.out.println(e.getText());
     }
     driver.close();

    }
}
