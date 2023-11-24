package StepDefination;

import StepCucumberCode.AT_05DDTUsingCucumber;
import io.cucumber.java.en.*;

import java.io.IOException;

public class SD_05DDTUsingCucumber {
    @Given("user navigates to Create and account screen")
    public void user_navigates_to_create_and_account_screen() throws IOException {
        AT_05DDTUsingCucumber.NavigateToUrl();
    }
    @Then("enter data {string},{string},{string}")
    public void enter_data(String FirstName, String LastName, String EmailAddress) {
        AT_05DDTUsingCucumber.EnterAccountDetails(FirstName,LastName,EmailAddress);

    }


}
