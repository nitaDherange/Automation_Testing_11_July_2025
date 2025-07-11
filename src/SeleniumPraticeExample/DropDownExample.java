package SeleniumPraticeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

     WebElement Dropdown= driver.findElement(By.id("carselect"));
        Select s= new Select(Dropdown);
        List<WebElement> allOptions = s.getOptions(); //to get all option
        for(WebElement e : allOptions){
            System.out.println(e.getText());
        }

        driver.close();
    }
}
