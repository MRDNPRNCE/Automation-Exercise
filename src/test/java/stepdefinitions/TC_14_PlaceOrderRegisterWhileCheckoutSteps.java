package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterWhileCheckoutPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_14_PlaceOrderRegisterWhileCheckoutSteps {

    RegisterWhileCheckoutPage registerWhileCheckoutPage = new RegisterWhileCheckoutPage();
    @Then("Add products to cart")
    public void add_products_to_cart() {
        registerWhileCheckoutPage.addToCard.click();

    }
    @And("Click View Cart button")
    public void clickViewCartButton() {
        registerWhileCheckoutPage.viewCard.click();
    }
    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        Assert.assertTrue(registerWhileCheckoutPage.cardMenu.isDisplayed());

    }
    @Then("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        registerWhileCheckoutPage.proceedToCheckoutButton.click();

    }
    @And("Click Register and Login button")
    public void clickRegisterAndLoginButton() {
        registerWhileCheckoutPage.registerLogin.click();
    }

    @Then("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        Faker faker = new Faker();
        registerWhileCheckoutPage.nameButton.sendKeys(faker.name().name());
        registerWhileCheckoutPage.signupEmailButton.sendKeys(faker.internet().emailAddress());
        registerWhileCheckoutPage.signupButton.click();
        ReusableMethods.waitFor(5);
        registerWhileCheckoutPage.gender.click();

        registerWhileCheckoutPage.passwordButton.sendKeys("123Abc1");
        Select select = new Select(registerWhileCheckoutPage.daysButton);
        select.selectByIndex(11);
        Select select1 = new Select(registerWhileCheckoutPage.monthsButton);
        select1.selectByValue("3");
        Select select2 = new Select(registerWhileCheckoutPage.yearsButton);
        select2.selectByVisibleText("1984");
        registerWhileCheckoutPage.smallButton.click();


        Actions actions = new Actions(Driver.getDriver());
        actions
                .click(registerWhileCheckoutPage.firstnameButton).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().industry())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().secondaryAddress())
                .perform();
        Select select3 = new Select(registerWhileCheckoutPage.country);
        select3.selectByIndex(4);
        actions.click(registerWhileCheckoutPage.state).sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .perform();
        ReusableMethods.waitFor(5);
        registerWhileCheckoutPage.createAccount.click();



    }
    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerWhileCheckoutPage.accountCreated.isDisplayed());
        registerWhileCheckoutPage.continueButton.click();

    }
    @Then("Verify Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {
        Assert.assertTrue(registerWhileCheckoutPage.loggedInAs.isDisplayed());

    }
    @And("Click Cart button")
    public void clickCartButton() {
        registerWhileCheckoutPage.card.click();
    }
    @Then("Click Proceed To Checkout button")
    public void click_proceed_to_checkout_button() {
        registerWhileCheckoutPage.proceedToCheckoutButton.click();

    }
    @Then("Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {
        Assert.assertTrue(registerWhileCheckoutPage.addressDetailsVisible.isDisplayed());
        Assert.assertTrue(registerWhileCheckoutPage.reviewYourOrderVisible.isDisplayed());

    }
    @Then("Enter description in comment text area and click Place Order")
    public void enter_description_in_comment_text_area_and_click_place_order() {
        registerWhileCheckoutPage.description.sendKeys("I like this product");
        registerWhileCheckoutPage.placeOrder.click();

    }

    @And("Enter payment details: {string} {string} {string} {string} {string}")
    public void enterPaymentDetails(String nameOnCard, String cardNumber, String cvcButton, String expirationDate, String expirationYear) {
        registerWhileCheckoutPage.nameOnCard.sendKeys(nameOnCard);
        registerWhileCheckoutPage.cardNumber.sendKeys(cardNumber);
        registerWhileCheckoutPage.cvcButton.sendKeys(cvcButton);
        registerWhileCheckoutPage.expiration.sendKeys(expirationDate);
        registerWhileCheckoutPage.expirationYear.sendKeys(expirationYear);
    }
    @Then("Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() {
        registerWhileCheckoutPage.payAndConfirmOrder.click();

    }
    @Then("Verify success message Your order has been placed successfully!")
    public void verify_success_message_your_order_has_been_placed_successfully() {
       // System.out.println(registerWhileCheckoutPage.orderPlacedConfirmed.getText());
        Assert.assertTrue(registerWhileCheckoutPage.orderPlacedConfirmed.isDisplayed());
    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        registerWhileCheckoutPage.deleteAccount.click();

    }
    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verify_account_deleted_and_click_continue_button() {
        String expected = "Verify ACCOUNT DELETED! and click Continue button";
        Assert.assertTrue(registerWhileCheckoutPage.areYouSure.getText().contains("expected"));

    }



}
