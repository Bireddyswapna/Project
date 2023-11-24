package SeleniumLearning;

import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;

public class AT_16ExcelPathLocation {
    @Test

      //C:\Users\Swapna Reddy Bireddy\IdeaProjects\swapnaProject\src\main\java\Resources\TestDataHN1.xlsx
public void ExcelPath() throws IOException {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.dir") + ReadPropertiesFile.PropFile("ExcelLocation"));


    }
}

