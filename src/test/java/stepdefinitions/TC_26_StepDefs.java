package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.TC_26_Page;
import utilities.Driver;

public class TC_26_StepDefs {

    TC_26_Page page = new TC_26_Page();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @When("Scroll down page to bottom")
    public void scroll_down_page_to_bottom() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @When("Verify SUBSCRIPTION is visible")
    public void verify_is_visible() {
        Assert.assertTrue(page.subscriptionText.isDisplayed());
    }
    @When("Scroll up page to top")
    public void scroll_up_page_to_top() {
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }
    @Then("Verify that page is scrolled up and {string} text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {
        Assert.assertTrue(page.longText.getText().equals(string));
    }

}
