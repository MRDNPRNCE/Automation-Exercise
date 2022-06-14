package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC18_page;
import pages.TC24_page;
import utilities.Driver;

public class TC24Stepdefinition {

    TC24_page tc24_page=new TC24_page();
    Actions action=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Then("Add products to cart")
    public void add_products_to_cart() {
        tc24_page.tc24AddToCart.click();

    }

    @Then("Click Cart button")
    public void click_cart_button() {
        tc24_page.tc24ViewCart.click();

    }

    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
       Assert.assertTrue(tc24_page.tc24VerfyCartPage.isDisplayed());

    }

    @Then("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        tc24_page.tc24ProceedToCheckout.click();

    }

    @Then("Click Register \\/ Login button")
    public void click_register_login_button() {
        tc24_page.tc24RegisterLogin.click();
    }



    @Then("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        tc24_page.tc24SingUpName.sendKeys(faker.name().firstName());
        tc24_page.tc24SingUpEmail.sendKeys(faker.internet().emailAddress());
        tc24_page.tc24SingUpButton.click();

       // String password=faker.internet().password();
        action.click( tc24_page.tc24MrsButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)

                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)

                .sendKeys("10")

                .sendKeys(Keys.TAB)

                .sendKeys("october")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())

                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)

                .sendKeys("india")
                .sendKeys(Keys.TAB)

                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()).perform();
              tc24_page.tc24CreateAccount.click();





    }

  //  @Then("Verify ACCOUNT CREATED! and click {string} button")
  //  public void verify_account_created_and_click_button(String string) {
    //    Assert.assertTrue(tc24_page.tc24AccountCreatedYazisi.isDisplayed());
     //   tc24_page.tc24ContinueButonu.click();

        @Then("Verify ACCOUNT CREATED! and click Continue button")
        public void verify_account_created_and_click_continue_button() {
            Assert.assertTrue(tc24_page.tc24AccountCreatedYazisi.isDisplayed());
            tc24_page.tc24ContinueButonu.click();
        }


    @Then("Verify  Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {
       Assert.assertTrue(tc24_page.tc24VerfyLoggedUsername.isDisplayed());
    }

    @Then("Click Cart2 button")
    public void click_cart2_button() {
       tc24_page.tc24ViewCart2.click();
    }




     @Then("Click Proceed To Checkout button")
   public void click_proceed_to_checkout_button() {
    tc24_page.tc24ProceedToCheckout2.click();
    }

   // @Then("Verify Address Details and Review Your Order")
  //  public void verify_address_details_and_review_your_order() {

   // }

   // @Then("Enter description in comment text area and click Place Order")
   // public void enter_description_in_comment_text_area_and_click_place_order() {

   // }

   // @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
   // public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {

   // }
   // @Then("Click Pay and Confirm Order button")
  //  public void click_pay_and_confirm_order_button() {

   // }

   // @Then("Verify success message Your order has been placed successfully!")
   // public void verify_success_message_your_order_has_been_placed_successfully() {

   // }
   // @Then("Click Download Invoice button and verify invoice is downloaded successfully.")
   // public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {

   // }

   // @Then("Click Continue button")
   // public void click_continue_button() {

   // }

   // @Then("Click Delete Account button")
  //  public void click_delete_account_button() {

   // }

   // @Then("Verify ACCOUNT DELETED! and click Continue button")
  //  public void verify_account_deleted_and_click_continue_button() {

  //  }

}
