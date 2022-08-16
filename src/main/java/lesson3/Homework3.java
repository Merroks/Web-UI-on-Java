package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.time.Duration;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automatisationtesting@yandex.ru");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("8qiW9J*FwJDLmu5");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("T-shirts");
        driver.findElement(By.xpath("//*[@class='btn btn-default button-search']")).click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']"))).click();

        Thread.sleep(10000);
        driver.quit();

    }
}
