package SeleniumPraticeExample;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class OpenWebSiteExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();  //step1 launch Browser
        driver.get("https://www.selenium.dev/downloads/");  //Step 2 Get URL
        String actual_title = driver.getTitle(); //check title with Actual Title
        if (actual_title.equals("Selenium Server (Grid)")) {
            System.out.println("Test Passed");

        } else {
            System.out.println("Test Failed");
        }

        driver.close(); //Close Browser
    }
}
