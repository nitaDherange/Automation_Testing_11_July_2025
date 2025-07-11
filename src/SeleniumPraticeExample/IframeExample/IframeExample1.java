package SeleniumPraticeExample.IframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class IframeExample1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");
        driver.manage().window().maximize();

       List<WebElement> AllIFrameElements = driver.findElements(By.tagName("iframe"));
        System.out.println("List of IFrame Elements Are :" +AllIFrameElements.size());
        driver.close();


    }
}
