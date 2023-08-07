package com.autoc0de.steps;

import com.autoc0de.pages.LoginPage;
import com.autoc0de.pages.MainDashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MainDashboardSteps {

    //PAGE INSTANCE
    LoginPage loginPage = new LoginPage();
    MainDashboardPage mainDashboardPage = new MainDashboardPage();

    @When("El usuario valida botones de Main Dashboard")
    public void theUserVerifiesThatHeWasOnTheWelcomeToAutocDeScreen() {
        mainDashboardPage.validarBotonesDashboard();
    }

    @And("Hace tap en el boton Beneficios")
    public void usuarioTapBotonBeneficiosMainDashboard() {
        mainDashboardPage.tapBeneficios();
    }

    @And("Hace tap en el boton Dudas")
    public void usuarioTapBotonDudasMainDashboard() {
        mainDashboardPage.tapDudas();
    }

    @And("Hace tap en el boton Comunidad")
    public void usuarioTapBotonComunidadMainDashboard() {
        mainDashboardPage.tapComunidad();
    }

    @And("Hace tap en el boton Salir")
    public void usuarioTapBotonSalirMainDashboard() {
        mainDashboardPage.tapSalir();
    }

    @And("El usuario valida salida de la app correctamente")
    public void usuarioVerificaSalidaApp() {
        mainDashboardPage.validarSalidaApp();
    }

    @Given("...x")
    public void metodoStepBasicoMainDash() {
        mainDashboardPage.serviceMethodExampleMainDash();
    }

    @When("^  '(.*)'    '(.*)'$")
    public void metodoStepBasicoVarMainDash(String var1, String var2) {
        mainDashboardPage.serviceMethodExampleVarMainDash(var1, var2);
    }


    @And(" ")
    public void metodoStepBasicoAndMainDashAnd() {
        mainDashboardPage.serviceMethodExampleMainDashAnd();
    }

    @Then("....")
    public void metodoStepBasicoThenMainDashThen() {
        mainDashboardPage.serviceMethodExampleMainDashThen();
    }
}
