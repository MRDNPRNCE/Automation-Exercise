package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC24_page {

    public TC24_page() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement tc24AddToCart;

    @FindBy(xpath = "(//a[@href='/view_cart'])[2]")
    public WebElement tc24ViewCart;

    @FindBy(xpath = "//tr[@class='cart_menu']")
    public WebElement tc24VerfyCartPage;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement tc24ProceedToCheckout;

    @FindBy(xpath = "(//a[@href='/login'])[2]")
    public WebElement tc24RegisterLogin;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement tc24SingUpName;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement tc24SingUpEmail;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement tc24SingUpButton;

    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement tc24MrsButton;

   // @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
   // public WebElement tc24AddToCart;

   @FindBy(xpath = "//button[@type='submit']")
   public WebElement tc24CreateAccount;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement tc24AccountCreatedYazisi;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement tc24ContinueButonu;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement tc24VerfyLoggedUsername;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    public WebElement tc24ViewCart2;

   @FindBy(xpath = "//a[@class='btn btn-default check_out']")
   public WebElement tc24ProceedToCheckout2;

}
