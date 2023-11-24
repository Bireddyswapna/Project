package StepCucumberCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;


import java.io.IOException;




public class AT_01Navigate {
    public static void NavGG() throws IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGRegPageUrl"));


    }
    public static void Assert(){
        String ActualTitle= OpenBrowser.driver.getTitle();
        System.out.println("Actual Title is "+ActualTitle);
        String ExpectedTitle="The Good Guys - Online Electrical & Home Appliances";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }

}
