package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC_17_Page;
import utilities.Driver;

public class TC_17_StepDefs {

    TC_17_Page page = new TC_17_Page();

    @When("Click X button corresponding to particular product")
    public void click_x_button_corresponding_to_particular_product() {
        page.buttonX.click();
    }

    @When("Click Cart button MK")
    public void click_cart_button_mk() {
        page.viewCart.click();
    }

    @Then("Verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() {
        Assert.assertTrue(page.emptySignal.isEnabled());
    }

}
