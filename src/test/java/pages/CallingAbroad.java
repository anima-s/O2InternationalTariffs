package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CallingAbroad {

    By payMonthly = By.xpath("//a[@id='paymonthly']");
    By callingAbroadHeader = By.xpath("//div[@id='content']/h2[.='How much does it cost to call or text abroad?']");
    By countryInput = By.xpath("/html//input[@id='countryName']");
    By selectCountryLink = By.xpath("/html//a[@id='showAllCountries']");
    By selectCountryPopUp = By.xpath("/html//div[@id='showBox']");
    By countryNameLink = By.xpath("//a[text()='India']");

    public WebDriver clickOnPayMonthlyTab(WebDriver driver){
        WebElement payMonthlyTab = driver.findElement(payMonthly);
        if(payMonthlyTab.isDisplayed()) payMonthlyTab.click();
        return driver;
    }

    public void selectCountry(WebDriver driver, String country){
        assert driver.findElement(callingAbroadHeader).isDisplayed();

        driver.findElement(selectCountryLink).click();
        //To check if this is highlighting to the active window or not
        driver.findElement(countryNameLink).click();

        //Approach 2 - in case countries div box is not in current page highlighted
//        driver.switchTo().activeElement();
//        driver.findElement(countryNameLink).click();

        //Approach 3 - in case countries div box is not in current page highlighted
//        driver.switchTo().frame(driver.findElement(selectCountryPopUp));
//        driver.findElement(countryNameLink).click();
    }
}
