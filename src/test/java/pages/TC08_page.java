package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC08_page {

    public TC08_page() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//img [@src='/static/images/home/logo.png']")
    public WebElement tc08VerfyGirisSayfasi;

    @FindBy(xpath = "//a [@href='/products']")
    public WebElement tc08ProductsButon;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement tc08AllProductButons;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement tc08ProductsListVisible;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement tc08FirstViewProductButons;

    @FindBy(xpath = "//img[@src='/get_product_picture/1']")
    public WebElement tc08VefyProductDetailPageElement;

    @FindBy(xpath = "//b[text()='Brand:']")
    public WebElement tc08VefyBrandElement;

    @FindBy(xpath = "//span[text()='Rs. 500']")
    public WebElement tc08VefyPriceElement;

      @FindBy(xpath = "//h2[text()='Blue Top']")
    public WebElement tc08VefyProductNameElement;

    @FindBy(xpath = "//p[text()='Category: Women > Tops']")
    public WebElement tc08VefyCategoryElement;

    @FindBy(xpath = "//b[text()='Availability:']")
    public WebElement tc08VefyAvailabilityElement;

    @FindBy(xpath = "//b[text()='Condition:']")
    public WebElement tc08VefyConditionElement;






}
