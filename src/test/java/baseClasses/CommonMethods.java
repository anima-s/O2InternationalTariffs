package baseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
    public static WebDriver driver;

    public WebDriver getChromeDriverInstance(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        System.out.println("Chrome driver set up successful");
        return driver;
    }


    public void gotoTravelAbroadPage(WebDriver driver){
        driver.get("http://international.o2.co.uk/internationaltariffs/calling_abroad_from_uk");
    }

    public void closeSession(WebDriver driver){
        driver.quit();
    }
}
