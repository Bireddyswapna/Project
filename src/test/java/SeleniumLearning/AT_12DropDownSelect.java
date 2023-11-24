package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class AT_12DropDownSelect {
    @Test
    public void DropDownSelect(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--Start-Maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.amazon.com.au/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // Select DropDownSelect = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
        //int DropDownSize=DropDownSelect.getOptions().size();
        //System.out.println("DropDownSize : "+DropDownSize);




    }
}
