package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AT_01NavigateTitleAssertScreenshot {
    @Test
    public void Navigation() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thegoodguys.com.au/");
        String ActualTitle= driver.getTitle();
        System.out.println("Actual Title is "+ActualTitle);
        String ExpectedTitle="The Good Guys - Online Electrical & Home Appliances";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        Assert.assertTrue(ActualTitle.contains("Electrical"));
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"\\src\\test\\java\\screenshots\\capture-1.jpeg"));


        






    }

}
