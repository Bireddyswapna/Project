package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AT_02LocatorsLearning {
    @Test
    public void LocatorSelenium() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("regAddForm_firstName")).sendKeys("MySoftware");
        Thread.sleep( 2000);
        driver.findElement(By.name("lastName")).sendKeys("Testing");
        Thread.sleep( 2000);
        driver.findElement(By.linkText("Catalogues")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Catalo")).click();



    }
}
