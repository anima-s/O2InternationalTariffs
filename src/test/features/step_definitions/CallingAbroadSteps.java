public class CallingAbroadSteps {
    WebDriver driver;
    PayMonthly payMonthlyPage = new PayMonthly(driver);

    @Given("^I am on Calling abroad page$")
    public void i_am_on_Calling_abroad_page()  {
        driver = CommonMethods.getChromeDriverInstance();
        driver.gotoTravelAbroadPage(driver);
    }

    @When("^I select India from the available countries$")
    public void i_select_India_from_the_available_countries() throws Throwable {
        driver.clickOnPayMonthlyTab(driver);
        driver.selectCountry(driver);
    }

    @When("^I click on Pay Monthly tab$")
    public void i_click_on_Pay_Monthly_tab() throws Throwable {
        verifyStandardRatesSection();
    }

    @Then("^I should be able to see the tariffs for India$")
    public void i_should_be_able_to_see_the_tariffs_for_India() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
