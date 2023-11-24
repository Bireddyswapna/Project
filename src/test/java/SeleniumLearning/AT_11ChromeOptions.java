package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AT_11ChromeOptions {
    @Test
    public void ChromeOpt(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--Start-Maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://automationexercise.com/");

    }
}
