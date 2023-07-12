package com.autoc0de.steps;

import com.autoc0de.pages.MainDashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MainDashboardSteps {

    //PAGE INSTANCE
    MainDashboardPage mainDashboardPage = new MainDashboardPage();

    @Given("...")
    public void metodoStepBasico() {
        mainDashboardPage.serviceMethodExample();
    }

    @When("^  '(.*)'    '(.*)'$")
    public void metodoStepBasicoVar(String var1, String var2) {
        mainDashboardPage.serviceMethodExampleVar(var1, var2);
    }


    @And(" ")
    public void metodoStepBasicoAnd() {
        mainDashboardPage.serviceMethodExample();
    }

    @Then("...")
    public void metodoStepBasicoThen() {
        mainDashboardPage.serviceMethodExample();
    }
}
