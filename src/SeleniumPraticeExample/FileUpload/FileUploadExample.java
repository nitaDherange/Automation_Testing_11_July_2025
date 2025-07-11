package SeleniumPraticeExample.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.findElement(By.id("file-upload")).sendKeys("D:\\ruhi summer camp\\summercampphotos");
        driver.findElement(By.id("file-submit")).click();
      WebElement e1= driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
      if (e1.isDisplayed()){
          System.out.println("File Uploaded Successfully1111");
      }else {
          System.out.println("File is not uploaded");
      }
        driver.close();

    }
}
