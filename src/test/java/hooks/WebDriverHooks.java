package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.Helper;

/**
 * Created by abelb on 8/1/2017.
 */
public class WebDriverHooks {

    private String driver;

    Helper helper;

    public WebDriverHooks(Helper helper) {
        this.helper = helper;
    }

    @Before
    public void startDriver() throws Exception {
        driver = "======================================\n"
                + "Opening the browser...\n";
        System.out.println(driver);
    }

    @After
    public void stopDriver() throws Exception {
        driver = "Closing the browser...\n"
                + "======================================";
        System.out.println(driver);
    }
}
