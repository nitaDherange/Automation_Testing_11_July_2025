package SeleniumPraticeExample.ExampleOFCookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetCookiesByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();

       Cookie C = new Cookie("Nita", "Dherange");
        driver.manage().addCookie(C);//Add Cookies

        driver.manage().getCookieNamed("Nita");//Get Cookies by name

        Set<Cookie> AllCookies = driver.manage().getCookies();//get all Cookies
        for (Cookie c : AllCookies){
            System.out.println(c);
        }
             driver.close();
    }
}
