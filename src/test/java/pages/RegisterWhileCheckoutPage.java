package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterWhileCheckoutPage {
    public RegisterWhileCheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement addToCard;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCard;

    @FindBy(className = "cart_menu")
    public WebElement cardMenu;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLogin;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameButton;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement signupEmailButton;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='days']")
    public WebElement daysButton;

    @FindBy(xpath = "//*[@id='months']")
    public WebElement monthsButton;

    @FindBy(xpath = "//*[@id='years']")
    public WebElement yearsButton;

    @FindBy(xpath = "//*[@id='optin']")
    public WebElement smallButton;

    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement gender;

    @FindBy(id = "first_name")
    public WebElement firstnameButton;

    @FindBy(id = "last_name")
    public WebElement lastnameButton;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipcode;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumber;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccount;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAs;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    public WebElement card;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement addressDetailsVisible;

    @FindBy(xpath = "//*[text()='Review Your Order']")
    public WebElement reviewYourOrderVisible;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement description;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//input[@class='form-control card-number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@class='form-control card-cvc']")
    public WebElement cvcButton;

    @FindBy(xpath = "//input[@class='form-control card-expiry-month']")
    public WebElement expiration;

    @FindBy(xpath = "//input[@class='form-control card-expiry-year']")
    public WebElement expirationYear;

    @FindBy(id = "submit")
    public WebElement payAndConfirmOrder;

    @FindBy(xpath = "//*[text()='Order Placed!']")
    public WebElement orderPlacedConfirmed;

    @FindBy(xpath = "//*[@href='/delete_account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()='Are you sure you want to delete this Delete Account?']")
    public WebElement areYouSure;



}
