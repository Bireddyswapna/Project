package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT_13RadioButtons {
    @Test
    public void RadioButton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://echoecho.com/htmlforms10.htm");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> RadioButtonList = driver.findElements(By.cssSelector("input[name^='radio1']"));
        int RadioSize=RadioButtonList.size();
        System.out.println("RadioButtonList: "+RadioSize);
        for(int i=0;i<RadioSize;i++){
            boolean RadioButtonDisplayed=RadioButtonList.get(i).isDisplayed();
            System.out.println("RadioButtonDisplayed: "+RadioButtonDisplayed);
            boolean RadioButtonSelect=RadioButtonList.get(i).isSelected();
            System.out.println("Is RadioButton Selected: "+RadioButtonSelect);
            if(!RadioButtonSelect){
                RadioButtonList.get(i).click();
                break;

            }

        }




    }
}
