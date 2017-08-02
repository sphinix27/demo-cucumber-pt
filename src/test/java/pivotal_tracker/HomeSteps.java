package pivotal_tracker;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import support.Helper;

/**
 * Created by abelb on 8/1/2017.
 */
public class HomeSteps {

    Helper helper;

    public HomeSteps(Helper helper) {
        this.helper = helper;
    }


    @Given("^I am at Pivotal Tracker \"([^\"]*)\" page$")
    public void iAmAtPivotalTrackerPage(String namePage) throws Throwable {
        helper.currentDriver = "FirefoxDriver";
        System.out.println("* I am on Pivotal Tracker " + namePage + " page\n");
    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String buttonName) throws Throwable {
        System.out.println("* I click on the " + buttonName + " button\n");
    }
}
