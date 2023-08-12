package com.autoc0de.steps;

import com.autoc0de.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

    //PAGE INSTANCE
    LoginPage loginPage = new LoginPage();

    @Given("El usuario esta en la pantalla de inicio de sesion de la aplicacion Underc0de")
    public void pantallaInicioApp() {
        loginPage.validarLoginScreen();
    }

    @Given("El usuario esta en la APP Underc0de")
    public void backgroundInicioApp() {
        loginPage.validarLoginScreen();
        loginPage.completarLogin();
        loginPage.tapIngresar();
    }

    @When("^El usuario ingresa sus credenciales Nombre de Usuario: '(.*)' y Password '(.*)'$")
    public void ingresoCredenciales(String user, String pass) {
        loginPage.completarCamposLogin(user, pass);
    }


    @And("El usuario hace tap en el boton Ingresar")
    public void usuarioTapBotonIngresarLogin() {
        loginPage.tapIngresar();
    }

    @Then("El usuario valida resultado de login en App Underc0de")
    public void theUserVerifiesThatHeWasOnTheWelcomeToAutocDeScreen() {
        loginPage.validarLoginCorrecto();
    }
}
