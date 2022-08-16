import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Homework5 {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    private final static String AUTOMATIONPRACTICE_BASE_URL = "http://automationpractice.com";

//    #####СЦЕНАРИЙ ИЗ 3-Й ДОМАШКИ######
//    WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automatisationtesting@yandex.ru");
//        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("8qiW9J*FwJDLmu5");
//        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
//        driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("T-shirts");
//        driver.findElement(By.xpath("//*[@class='btn btn-default button-search']")).click();
//
//    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
//                ("//*[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']"))).click();
//
//        Thread.sleep(10000);
//        driver.quit();

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(AUTOMATIONPRACTICE_BASE_URL);
    }

    @Test
    @DisplayName("Входим в свою учетную запись, ищем через поиск Футболки, " +
            "в найденных результатах переходим в карточку товара")

    void logInFindTShirtsWithSearchThenMoveIn () {
    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));

    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automatisationtesting@yandex.ru");
    driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("8qiW9J*FwJDLmu5");
    driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

    driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("T-shirts");
    driver.findElement(By.xpath("//*[@class='btn btn-default button-search']")).click();

    WebDriverWait webDriverWait_1 = new WebDriverWait(driver, Duration.ofSeconds(5));
    webDriverWait_1.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']"))).click();

    Assertions.assertEquals(
            driver.findElement(By.xpath("//div[@class ='box-cart-bottom']//span")).isDisplayed(), true);
    }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
}

