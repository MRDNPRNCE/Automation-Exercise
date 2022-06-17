package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class TC_17_Page {

    public TC_17_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (className = "cart_quantity_delete")
    public WebElement buttonX;

    @FindBy (linkText = "here")
    public WebElement emptySignal;

    @FindBy (linkText = "View Cart")
    public WebElement viewCart;
}
