package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.TC22_RecommendedItemsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_22_RecommendedItemsSteps {

    TC22_RecommendedItemsPage recommendedItemsPage = new TC22_RecommendedItemsPage();
    @Given("Scroll to bottom of page")
    public void scroll_to_bottom_of_page() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text()='Subscription']"));
        js.executeScript("arguments[0].scrollIntoView();", element);


    }
    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verify_recommended_items_are_visible() {
        Assert.assertTrue(recommendedItemsPage.recommendedItemsVerify.isDisplayed());

    }
    @Then("Click on Add To Cart on Recommended product")
    public void click_on_add_to_cart_on_recommended_product() {
        ReusableMethods.waitFor(5);
        recommendedItemsPage.addToCardRecommended.click();

    }
    @Then("Click on View Cart button")
    public void click_on_view_cart_button() {
        recommendedItemsPage.viewCardButton.click();


    }

    @Then("Verify that product is displayed in cart page")
    public void verify_that_product_is_displayed_in_cart_page() {
        Assert.assertTrue(recommendedItemsPage.styleDressVisible.isDisplayed());

    }

}
