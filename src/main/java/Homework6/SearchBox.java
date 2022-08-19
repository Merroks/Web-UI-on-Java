package Homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox extends BasePage {

    public SearchBox(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchField;
    //*[@class='btn btn-default button-search']
    //*[@id='search_query_top']

    public ResultsSearchTShirtsPage tShirtSearchButton(String s) {
        driver.findElement(By.id("search_query_top")).sendKeys(s);
//        actions.moveToElement(searchField).sendKeys(s)
//                .build()
//                .perform();
        return new ResultsSearchTShirtsPage(driver);
    }
}
