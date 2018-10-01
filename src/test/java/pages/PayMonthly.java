package pages;

import com.sun.tools.javac.util.Assert;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PayMonthly {
    WebDriver driver ;

    By tabHeader = By.xpath("//div[@id='paymonthlyTariffPlan']/h2[.='Available rates when calling or texting India...']");
    By standardRatesLabel = By.xpath("//div[#'standardRates']/?/?/b[@innertext='Standard Rates']");
    By countryFlagImage = By.xpath("//div[#'standardRates']/?/?/img[@alt='India']");
    By landlineLabel = By.xpath("//table[#'standardRatesTable']//td[@innertext='Landline']");
    By mobilesLabel = By.xpath("//table[#'standardRatesTable']//td[@innertext='Mobiles']");
    By textMessageLabel = By.xpath("//table[#'standardRatesTable']//td[@innertext='Cost per text message']");
    By landlineTariff = By.xpath("/html//table[@id='standardRatesTable']/tbody/tr[1]/td");
    By mobilesTariff = By.xpath("/html//table[@id='standardRatesTable']/tbody/tr[2]/td");
    By textMessageTariff = By.xpath("/html//table[@id='standardRatesTable']//td");

    public void payMonthly(WebDriver driver){
        this.driver = driver;
    }
    
    public void verifyStandardRatesSection(WebDriver driver){
        assert driver.findElement(tabHeader).isDisplayed();
        assert driver.findElement(standardRatesLabel).isDisplayed();
        assert driver.findElement(countryFlagImage).isDisplayed();
        assert driver.findElement(landlineLabel).isDisplayed();
        assert driver.findElement(mobilesLabel).isDisplayed();
        assert driver.findElement(textMessageLabel).isDisplayed();

        assert driver.findElement(landlineTariff).getText().contains("£2.00");
        assert driver.findElement(mobilesTariff).getText().contains("£2.00");
        assert driver.findElement(textMessageTariff).getText().contains("55p");
    }
}
