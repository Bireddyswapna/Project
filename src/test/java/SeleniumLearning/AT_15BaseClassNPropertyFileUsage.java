package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;

import static BaseClass.OpenBrowser.driver;

public class AT_15BaseClassNPropertyFileUsage {
    @Test
    public void Navigate() throws IOException, InterruptedException {
       // OpenBrowser.NavToWeb("https://www.google.com");
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("googleUrl"));
        driver.quit();
    }

}
