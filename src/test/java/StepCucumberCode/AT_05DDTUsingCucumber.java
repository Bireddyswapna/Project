package StepCucumberCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class AT_05DDTUsingCucumber {
    @Test
    public static void NavigateToUrl() throws IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGRegPageUrl"));
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"myAcctId\"]/div/a/i")).click();
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"btn_register\"]")).click();
    }
    @Test
    public static void EnterAccountDetails(String FirstName, String LastName, String EmailAddress){
        OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).clear();
        OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);
        OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).clear();
        OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).sendKeys(LastName);
        OpenBrowser.driver.findElement(By.id("regAddForm_email1")).clear();
        OpenBrowser.driver.findElement(By.id("regAddForm_email1")).sendKeys(EmailAddress);

    }
}
