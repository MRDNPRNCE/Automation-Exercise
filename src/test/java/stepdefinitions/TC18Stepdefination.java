package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TC18_page;
import utilities.Driver;

public class TC18Stepdefination {

    TC18_page tc18_page=new TC18_page();
    Actions actions=new Actions(Driver.getDriver());

    @Then("Verify that categories are visible on left side bar")
    public void verify_that_categories_are_visible_on_left_side_bar() {
        Assert.assertTrue(tc18_page.tc18CategoriesVisible.isDisplayed());
    }

    @Then("Click on Women category")
    public void click_on_women_category() {
        tc18_page.tc18WomenElement.click();

    }
    @Then("Click on any category link under Women category, for example: Dress")
    public void click_on_any_category_link_under_women_category_for_example_dress() {
         tc18_page.tc18DressElement.click();
    }

    @Then("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verify_that_category_page_is_displayed_and_confirm_text_women_tops_products() {
        Assert.assertTrue(tc18_page.tc18ConfirmWOMEN_TOPS_PRODUCTS.isDisplayed());
    }

    @Then("On left side bar, click on any sub-category link of Men category")
    public void on_left_side_bar_click_on_any_sub_category_link_of_men_category() {
        tc18_page.tc18MenElement.click();
        tc18_page.tc18TshirtsElement.click();
    }

    //@Then("Verify that user is navigated to that category page")
   // public void verify_that_user_is_navigated_to_that_category_page() {


   // }


}
