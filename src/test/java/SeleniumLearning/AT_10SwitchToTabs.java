package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AT_10SwitchToTabs {
    @Test
    public void SwitchTabLearning() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a[href='/brand_products/Babyhug']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().refresh();
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        int tabSize = tabs.size();
        System.out.println("tabs count : " + tabSize);
        for (int i = 0; i < tabSize; i++) {
            driver.switchTo().window(tabs.get(i));//it will switch to main tab
            break;
        }


    }
}
