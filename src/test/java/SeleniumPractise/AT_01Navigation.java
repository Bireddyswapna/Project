package SeleniumPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT_01Navigation {
    @Test
public void Navigation01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.au/");
      //  driver.findElement(By.linkText("Your Account")).click();
      //  driver.findElement(By.xpath("//*[contains(@class,'a-color-secondary')]")).click();
       // driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@gmail.com");
        //Thread.sleep(2000);
       // driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        WebElement CreateAccEle= driver.findElement(By.xpath("//*[contains(@class,'product-image') and contains(@alt,'Coupons' )]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CreateAccEle);
        driver.findElement(By.xpath("//*[contains(@class,'product-image') and contains(@alt,'Coupons' )]")).click();




    }

}
