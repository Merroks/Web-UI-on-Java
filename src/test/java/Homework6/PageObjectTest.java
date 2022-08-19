package Homework6;

import io.github.bonigarcia.wdm.WebDriverManager;
import Homework6.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    void putTShirtToCartTest() throws InterruptedException {
           new MainPage(driver).clickSingInButton()
                .login("automatisationtesting@yandex.ru", "8qiW9J*FwJDLmu5")
                .searchBox.tShirtSearchButton("T-shirts")
                .clickTShirtsButton()
                .moveMouseToProductAndAddToCart();
                //.checkTotalSumma("$18.51");
        Assertions.assertEquals(
                driver.findElement(By.xpath("//div[@class ='box-cart-bottom']//span")).isDisplayed(), true);

        //Thread.sleep(10000);
    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
