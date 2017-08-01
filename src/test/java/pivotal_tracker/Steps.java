package pivotal_tracker;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.Helper;

/**
 * Created by abelb on 8/1/2017.
 */
public class Steps {

    Helper helper;

    public Steps(Helper helper) {
        this.helper = helper;
    }

    @Given("^I am at Pivotal Tracker \"([^\"]*)\" page$")
    public void iAmAtPivotalTrackerPage(String namePage) throws Throwable {
        System.out.println("* I am on Pivotal Tracker " + namePage + " page\n");
    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String buttonName) throws Throwable {
        System.out.println("* I click on the " + buttonName + " button\n");
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
