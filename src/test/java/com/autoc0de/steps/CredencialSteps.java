package com.autoc0de.steps;

import com.autoc0de.pages.CredencialPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CredencialSteps {

    //PAGE INSTANCE
    CredencialPage credencialPage = new CredencialPage();

    @Given("...")
    public void metodoStepBasico() {
        credencialPage.serviceMethodExample();
    }

    @When("^  '(.*)'    '(.*)'$")
    public void metodoStepBasicoVar(String var1, String var2) {
        credencialPage.serviceMethodExampleVar(var1, var2);
    }


    @And(" ")
    public void metodoStepBasicoAnd() {
        credencialPage.serviceMethodExample();
    }

    @Then("...")
    public void metodoStepBasicoThen() {
        credencialPage.serviceMethodExample();
    }
}
