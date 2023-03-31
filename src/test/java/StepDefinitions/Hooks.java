package StepDefinitions;

import Utilities.BaseDriver;

import io.cucumber.java.After;

public class Hooks {

    @After
    public void after() {
        BaseDriver.quitDriver();
    }

}
