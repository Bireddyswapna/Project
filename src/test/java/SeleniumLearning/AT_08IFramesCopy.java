package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT_08IFramesCopy {
    @Test
    public void Iframes01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://www.harveynorman.com.au/");
        driver.get("https://www.harveynorman.com.au/signup");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("[data-testid='signup']")).click();
        List<WebElement> ListOfiFrames = driver.findElements(By.tagName("iframe"));
        int IFrameCount=ListOfiFrames.size();
        System.out.println("The value of Iframe= "+IFrameCount);
        for (int i = 0; i < IFrameCount; i++) {
            driver.switchTo().frame(i);
            driver.findElement(By.cssSelector("input[id^='firstName']")).sendKeys("FirstName");
            break;
        }



    }
}
