package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT_18DeletingCookies {
    @Test
    public void DeleteCookies(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get("https://www.thegoodguys.com.au/");




    }
   // @Test
    //public void Navigate() throws IOException {
      //  OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGRegPageUrl"));

    //}
}
