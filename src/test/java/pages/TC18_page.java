package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC18_page {

    public TC18_page() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//h2[text()='Category']")
    public WebElement tc18CategoriesVisible;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement tc18WomenElement;

    @FindBy(xpath = "//a[@href='/category_products/1']")
    public WebElement tc18DressElement;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement tc18ConfirmWOMEN_TOPS_PRODUCTS;

    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement tc18MenElement;

    @FindBy(xpath = "//a[@href='/category_products/3']")
    public WebElement tc18TshirtsElement;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement tc18ComfirmMen_Tshirts_Products;

}
