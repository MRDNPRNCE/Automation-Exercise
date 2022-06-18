package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_07_Page {

    public TC_07_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Full-Fledged practice website for Automation Engineers']")
    public WebElement text;

    @FindBy (linkText = "Test Cases")
    public WebElement testCasesButton;

    @FindBy (xpath = "//*[text()='Test Cases']")
    public WebElement testCaseTitle;
}
