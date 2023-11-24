package StepCucumberCode;

import BaseClass.OpenBrowser;
import org.openqa.selenium.By;

public class AT_02Signup {
    public static void SignUp(){
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"myAcctId\"]/div/a/i")).click();
    }
}
