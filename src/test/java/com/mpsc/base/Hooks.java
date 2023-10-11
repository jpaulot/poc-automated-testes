package com.mpsc.base;

import com.mpsc.base.pages.BasePage;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

    @Before
    public void beforeScenarioAllTests() {
        getDriver().manage().deleteAllCookies();
    }

}
