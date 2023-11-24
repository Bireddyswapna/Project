package StepDefination;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD_04HooksConceptWithTags {
    @Before("@First")
    @Given("this is the first method")
    public void this_is_the_first_method() {
        System.out.println("This is the start of first scenario method");

    }

    @Then("end of first method")
    public void end_of_first_method() {
        System.out.println("This is the end of first scenario method");

    }
    @After("@Second")


    @Given("this is the second method")
    public void this_is_the_second_method() {
        System.out.println("This is the start of second scenario method");


    }

    @Then("end of second method")
    public void end_of_second_method() {
        System.out.println("This is the end of second scenario method");


    }
}
