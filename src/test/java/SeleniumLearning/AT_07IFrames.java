package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT_07IFrames {
    @Test
    public void iframes(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/contact-us/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> ListOfiFrames = driver.findElements(By.tagName("iframe"));
        int IframeCount= ListOfiFrames.size();
        System.out.println("The Value of IFrameCount= "+IframeCount);
       // for(int i=0;i<IframeCount;i++){
            //driver.switchTo().frame(i);




    }
}
