package SeleniumPraticeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForEditButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[5]"));
        Thread.sleep(1000);
        driver.close();
    }

}
