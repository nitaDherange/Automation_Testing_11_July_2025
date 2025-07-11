package SeleniumPraticeExample.ExampleOFCookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeletionOfCookiesByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();
        //Add Cookies
        Cookie c = new Cookie("LMM","Services");
        driver.manage().addCookie(c); //Add Cookies

        //Before Delection
        System.out.println("Cookies before deletion");
        Set<Cookie> cookies =driver.manage().getCookies();
        for(Cookie AC :cookies ) {
            System.out.println(AC);
        }

            //deletion of cookies by name
            driver.manage().deleteCookieNamed("LMM");

            //After Delection
            System.out.println("Cookies after deletion");
            Set<Cookie> cookies1 = driver.manage().getCookies();
            for (Cookie AC2:cookies1 ){
                System.out.println(AC2);
            }


        driver.close();
    }
}
