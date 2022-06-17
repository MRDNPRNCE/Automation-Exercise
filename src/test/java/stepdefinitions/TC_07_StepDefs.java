package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC_07_Page;
import utilities.Driver;

public class TC_07_StepDefs {

    TC_07_Page page = new TC_07_Page();

    @Given("Navigate to urla {string}")
    public void navigate_to_urla(String string) {
        Driver.getDriver().get(string);
        Driver.getDriver().manage().window().fullscreen();
    }

    @When("Click on Test Cases button")
    public void click_on_test_cases_button() {
        page.testCasesButton.click();
    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(page.testCaseTitle.isDisplayed());
    }





}
