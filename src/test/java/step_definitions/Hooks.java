package step_definitions;

import driver.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseDriver {

    @Before()
    public void launch_browser() {
        initializeDriver();
    }

    @After()
    public void quite_browser() {
        quiteBrowser();
    }

}
