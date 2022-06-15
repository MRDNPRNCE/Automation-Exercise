package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.TC_07_verify_test_cases_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_07_Verify_Test_Cases_Page {

    public TC_07_Verify_Test_Cases_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    TC_07_verify_test_cases_page testCasesPage = new TC_07_verify_test_cases_page();


    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(string);
    }
    @Given("Verify that home page is visible successfully MK")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertEquals(testCasesPage.automationExerciseTitle.getText(), "Exercise");
    }
    @When("Click on Test Cases button")
    public void click_on_test_cases_button() {
        testCasesPage.testCasesButton.click();
    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(testCasesPage.testCaseTitle.isDisplayed());
    }




}
