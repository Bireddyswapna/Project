package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT_06ListOfLinks {
    @Test
    public void ListOfLinks(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.thegoodguys.com.au/");
        List<WebElement> ListOfLinks=driver.findElements(By.tagName("a"));
        // count
        int LinksCount= ListOfLinks.size();
        System.out.println("ListOfLinks : " + LinksCount);
        for(int i=0;i<LinksCount;i++) {
            String LinkName = ListOfLinks.get(i).getText();
            System.out.println("LinkName : " + LinkName);
            if (LinkName.equalsIgnoreCase("Sitemap")) {
                //   Thread.sleep(10000);
                //  WebElement element= driver.findElement(By.xpath("//*[@id='FooterSiteMap']"));
                // System.out.println(element.getText());
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", ListOfLinks.get(i));
                //ListOfLinks.get(i).click();
                break;
            }
        }


    }
}
