package Homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox extends BasePage {
    public Object tShirtSearchButton;

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='btn btn-default button-search']")        //   //*[@id='search_query_top']
    private WebElement searchField;

    public ResultsSearchTShirtsPage tShirtSearchButton(String s) {
        actions.moveToElement(searchField).sendKeys(s)
                .build()
                .perform();
        return new ResultsSearchTShirtsPage(driver);
    }
}
//    public MainPage login(String login, String password) {
//        //webDriverWait.until(ExpectedConditions.visibilityOf(emailField));
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(emailIdLocator)));
//        emailField.sendKeys(login);
//        passwordField.sendKeys(password);
//        signInButton.click();
//        return new MainPage(driver);