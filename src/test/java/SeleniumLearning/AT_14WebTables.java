package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class AT_14WebTables {
    @Test
    public void WebTables(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(System.getProperty("user.dir")+"/src/main/java/Resources/webtablehtml.html");
        List<WebElement> colcount  =driver.findElements(By.xpath("/html/body/table/thead/tr/th"));
        int colsize=colcount.size();
        System.out.println("colsize is:"+colsize);
        List<WebElement> rowcount  =driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        int rowsize= rowcount.size();
        System.out.println("rowsize is: "+rowsize);


    }

}
