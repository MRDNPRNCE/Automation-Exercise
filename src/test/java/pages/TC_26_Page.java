package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_26_Page {

    public TC_26_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Subscription']")
    public WebElement subscriptionText;

    @FindBy (xpath = "//*[text()='Full-Fledged practice website for Automation Engineers']")
    public WebElement longText;
}
