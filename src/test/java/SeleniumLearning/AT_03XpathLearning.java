package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT_03XpathLearning {
    @Test
    public void Xpath01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thegoodguys.com.au/");
        driver.findElement(By.xpath("//*[@class='nav-supplementary-icon ggdsicon-user-slim-o']")).click();
        driver.findElement(By.xpath("//button[contains(@id,'btn_register') ]")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}