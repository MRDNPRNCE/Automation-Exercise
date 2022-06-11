package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC22_RecommendedItemsPage {


    public TC22_RecommendedItemsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='recommended items']")
    public WebElement recommendedItemsVerify;

    @FindBy(xpath = "(//*[@data-product-id='4'])[3]")
    public WebElement addToCardRecommended;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCardButton;

    @FindBy(xpath = "//*[text()='Stylish Dress']")
    public WebElement styleDressVisible;

}
