package SeleniumPraticeExample.ScreenShotUsingSelenium;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
public class ScreenShotExample {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

     File ScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File destination = new File("D:\\Ruhi day care\\Screenshot 2025-06-25 205157.png");
     FileHandler.copy(ScreenShot,destination );
        System.out.println("Screenshot save successfully.");
        driver.close();
    }

}
