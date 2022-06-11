package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchProductPage {

    public SearchProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@src='/static/images/home/logo.png']")
    public WebElement automationExerciseLogo;

    @FindBy(xpath = "//*[@href='/products']")
    public WebElement productLink;

    @FindBy(xpath = "//*[.='All Products']")
    public WebElement allProductsVisible;

    @FindBy(id = "search_product")
    public WebElement searchProductButton;

    @FindBy(id = "submit_search")
    public WebElement submitSearch;

    @FindBy(xpath = "//*[.='Searched Products']")
    public WebElement searchedProductVisible;

}
