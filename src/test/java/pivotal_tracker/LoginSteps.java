package pivotal_tracker;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.Helper;

/**
 * Created by abelb on 8/1/2017.
 */
public class LoginSteps {

    Helper helper;

    public LoginSteps(Helper helper) {
        this.helper = helper;
    }


    @When("^I log in$")
    public void iLogIn() throws Throwable {
        System.out.println("* I login with valid credentials\n");
    }

    @Then("^I should see \"([^\"]*)\" page$")
    public void iShouldSeePage(String namePage) throws Throwable {
        System.out.println("* I should see " + namePage + " page\n");
        System.out.println("The current Driver is: " + helper.currentDriver + "\n");
    }
}
