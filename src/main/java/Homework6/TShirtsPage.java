package Homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TShirtsPage extends BasePage {
    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']")
    private WebElement productElement;

    public SuccessAddToCartPage moveMouseToProductAndAddToCart() {
        driver.findElement(By.xpath("//*[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']")).click();
//        actions.moveToElement(productElement)
//                .build()
//                .perform();
//        addToCartButton.click();
        return new SuccessAddToCartPage(driver);
    }

}
