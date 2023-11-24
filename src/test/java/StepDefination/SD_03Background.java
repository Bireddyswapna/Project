package StepDefination;

import StepCucumberCode.AT_03BackgroundUse;
import io.cucumber.java.en.*;
import org.junit.Before;
import org.junit.Test;

public class SD_03Background {

    @Test

    @Given("from the signup page click on CrateAnAccount button")
    public void from_the_signup_page_click_on_crate_an_account_button() {
        AT_03BackgroundUse.BackgroundUse01();

    }

    @Then("enter FirstName as MyName")
    public void enter_first_name_as_my_name() {
        AT_03BackgroundUse.BackgroundUse02();

    }
    @Given("from the signup page click on catalogues")
    public void from_the_signup_page_click_on_catalogues() {
        AT_03BackgroundUse.Background03();

    }
    @Then("click on the image")
    public void click_on_the_image() {
        AT_03BackgroundUse.Background04();

    }
}
