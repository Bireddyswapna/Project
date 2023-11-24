package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT_04QuitvsClose {
    @Test
    public void QuitsClose(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thegoodguys.com.au/AjaxLogonForm?myAcctMain=1&catalogId=30000&langId=-1&storeId=900");
        driver.quit();


    }
}
