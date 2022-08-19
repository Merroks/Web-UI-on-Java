package Homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsSearchTShirtsPage extends BasePage {

    public ResultsSearchTShirtsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchButton; //- поменяли локатор для кнопки поиска

    public ResultsSearchTShirtsPage tShirtSearchButton(String s) {
        driver.findElement(By.id("search_query_top")).sendKeys(s);
        actions.moveToElement(searchButton).sendKeys(s)
        .build()
        .perform();
        return new ResultsSearchTShirtsPage(driver);
    }

    public TShirtsPage clickTShirtsButton() {
        searchButton.click();
        return new TShirtsPage(driver);
    }
}
