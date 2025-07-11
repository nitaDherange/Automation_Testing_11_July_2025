package SeleniumPraticeExample.ExampleOFCookies;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AddCookiesExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();

        Cookie C = new Cookie("Nita", "Dherange");
        driver.manage().addCookie(C);
        Set<Cookie> cookies = driver.manage().getCookies();// to get all cookies
        for (Cookie c : cookies) {
            System.out.println(c);


        }
        driver.close();
    }
}
