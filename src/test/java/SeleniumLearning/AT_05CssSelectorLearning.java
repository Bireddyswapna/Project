package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT_05CssSelectorLearning {
    @Test
    public void CssSelector() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thegoodguys.com.au/");
        driver.findElement(By.cssSelector("#SimpleSearchForm_SearchTermB2C")).sendKeys("laptops");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class='fa fa-search']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
