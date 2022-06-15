package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TC08_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC08Stepdefinition {

    TC08_page tc08_page=new TC08_page();
  Actions actions=new Actions(Driver.getDriver());

    @Given("Navigate to url {string}")
    public void navigate_to_url(String AutomationExerciseUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("AutomationExerciseUrl"));
    }

    @Then("Verify that home page is visible successful")
    public void verify_that_home_page_is_visible_successfully() {
      Assert.assertTrue(tc08_page.tc08VerfyGirisSayfasi.isDisplayed());

    }

    @Then("Click on Products butt")
    public void click_on_products_button() {
      tc08_page.tc08ProductsButon.click();

    }

    @Then("Verify user is navigated to ALL PRODUCTS page successful")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
      Assert.assertTrue(tc08_page.tc08AllProductButons.isDisplayed());

    }

    @Then("The products list is visible")
    public void the_products_list_is_visible() {
      Assert.assertTrue(tc08_page.tc08ProductsListVisible.isDisplayed());

    }

    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
      tc08_page.tc08FirstViewProductButons.click();

    }

    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
      Assert.assertTrue(tc08_page.tc08VefyProductDetailPageElement.isDisplayed());

    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
      Assert.assertTrue(tc08_page.tc08VefyProductNameElement.isDisplayed());
      Assert.assertTrue(tc08_page.tc08VefyCategoryElement.isDisplayed());
      Assert.assertTrue(tc08_page.tc08VefyPriceElement.isDisplayed());
      Assert.assertTrue(tc08_page.tc08VefyAvailabilityElement.isDisplayed());
      Assert.assertTrue(tc08_page.tc08VefyConditionElement.isDisplayed());
      Assert.assertTrue(tc08_page.tc08VefyBrandElement.isDisplayed());
    }




}
