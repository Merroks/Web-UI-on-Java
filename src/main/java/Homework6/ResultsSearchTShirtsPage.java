package Homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsSearchTShirtsPage extends BasePage {

    public ResultsSearchTShirtsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='search_query_top']")
    private WebElement searchButton;

    public TShirtsPage clickTShirtsButton() {
        searchButton.click();
        return new TShirtsPage(driver);
    }
}

//     //*[@class='btn btn-default button-search']