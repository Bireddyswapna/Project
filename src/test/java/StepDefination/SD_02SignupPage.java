package StepDefination;

import StepCucumberCode.AT_02Signup;
import io.cucumber.java.en.Then;
import org.junit.Test;

public class SD_02SignupPage {
    @Test
    @Then("Click on signup link from homepage")
    public void click_on_signup_link_from_homepage() {
        AT_02Signup.SignUp();

    }
}
