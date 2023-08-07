package com.autoc0de.steps;

import com.autoc0de.pages.CredencialPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CredencialSteps {

    //PAGE INSTANCE
    CredencialPage credencialPage = new CredencialPage();

    @Given("...xxx")
    public void metodoStepBasicoCredenciales() {
        credencialPage.serviceMethodExampleCredenciales();
    }

    @When("^'(.*)'    '(.*)'$")
    public void metodoStepBasicoVarCredenciales(String var1, String var2) {
        credencialPage.serviceMethodExampleVarCredenciales(var1, var2);
    }


    @And("asd")
    public void metodoStepBasicoAndCredencialesAnd() {
        credencialPage.serviceMethodExampleCredencialesAnd();
    }

    @Then("...")
    public void metodoStepBasicoThenCredencialesThen() {
        credencialPage.serviceMethodExampleCredencialesThen();
    }
}
