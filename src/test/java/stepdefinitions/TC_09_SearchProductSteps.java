package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SearchProductPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_09_SearchProductSteps {

    SearchProductPage searchProductPage = new SearchProductPage();

    @Given("Navigate to {string}")
    public void navigate_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(searchProductPage.automationExerciseLogo.isDisplayed());

    }
    @Then("Click on Products button")
    public void click_on_products_button() {
        searchProductPage.productLink.click();

    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(searchProductPage.allProductsVisible.isDisplayed());

    }
    @Then("Enter {string} in search input and click search button")
    public void enter_in_search_input_and_click_search_button(String productName) {
        searchProductPage.searchProductButton.sendKeys("Jeans");
        searchProductPage.submitSearch.click();

    }
    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
        Assert.assertTrue(searchProductPage.searchedProductVisible.isDisplayed());

    }
    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {

    }




}
