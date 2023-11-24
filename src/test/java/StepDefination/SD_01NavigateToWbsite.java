package StepDefination;

import StepCucumberCode.AT_01Navigate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;

import java.io.IOException;

public class SD_01NavigateToWbsite {
    @Test
    @Given("open browser and enter url and navigate to GoodGuys website")
    public void open_browser_and_enter_url_and_navigate_to_good_guys_website() throws IOException {
        AT_01Navigate.NavGG();
    }

    @Then("get title and assert")
    public void get_title_and_assert() {
        AT_01Navigate.Assert();

    }
}
