package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import Utilities.Xls_Reader;
import org.junit.Test;
import org.openqa.selenium.By;


import java.io.IOException;

public class AT_17ExcelDataUsage{
    @Test
    public void ExcelDataUse() throws IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGRegPageUrl"));
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"myAcctId\"]/div/a/i")).click();
        OpenBrowser.driver.findElement(By.xpath("//*[@id=\"btn_register\"]")).click();

        Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+ ReadPropertiesFile.PropFile("ExcelLocation"));
        int RowCount= reader.getRowCount("RegTestData");
        System.out.println("RowCount= "+RowCount);
        for(int i=2;i<=RowCount;i++){
            //FirstName
            String FirstName=  reader.getCellData("RegTestData","FirstName",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);
            //last name
            String lastname=reader.getCellData("RegTestData","LastName",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).sendKeys(lastname);
            //Here we picked up data for Email Address from excel
            String email_address=reader.getCellData("RegTestData","EmailAddress",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_email1")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_email1")).sendKeys(email_address);
            //Password
            String password=reader.getCellData("RegTestData","Password",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_password")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_password")).sendKeys(password);
            //reenter password
            String confirmation=reader.getCellData("RegTestData","RePassword",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_passwordNew")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_passwordNew")).sendKeys(confirmation);
            //Thread.sleep(5000);
        }
          }
}
