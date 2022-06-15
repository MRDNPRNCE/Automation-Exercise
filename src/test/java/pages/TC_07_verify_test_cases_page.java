package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_07_verify_test_cases_page {

    @FindBy (xpath = "//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h1/span")
    public WebElement automationExerciseTitle;

    @FindBy (linkText = "Test Cases")
    public WebElement testCasesButton;

    @FindBy (xpath = "//h2/b")
    public WebElement testCaseTitle;
}
