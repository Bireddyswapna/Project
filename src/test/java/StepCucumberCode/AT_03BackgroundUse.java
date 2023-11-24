package StepCucumberCode;

import BaseClass.OpenBrowser;
import org.openqa.selenium.By;

public class AT_03BackgroundUse {
    public static void BackgroundUse01() {
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"btn_register\"]")).click();
        //OpenBrowser.driver.findElement(By.xpath("//*[@id=\"regAddForm_firstName\"]")).sendKeys("MyName");
    }

    public static void BackgroundUse02() {
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"regAddForm_firstName\"]")).sendKeys("MyName");
    }
    public static void Background03(){
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"topnav-catalogues\"]")).click();
    }
    public static void Background04(){
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"contentRecommendationWidget_1_-1000_4099276460824622664\"]/div/div[2]/div[3]/div[1]/div[1]/a/img")).click();
    }
}