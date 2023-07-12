package com.autoc0de.steps;

import com.autoc0de.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

    //PAGE INSTANCE
    LoginPage loginPage = new LoginPage();

    @Given("El usuario está en la pantalla de inicio de sesión de la aplicación Underc0de")
    public void pantallaInicioApp() {
        loginPage.validarLoginScreen();
    }

    @When("^El usuario ingresa sus credenciales Nombre de Usuario: '(.*)' y Password '(.*)'$")
    public void ingresoCredenciales(String user, String pass) {
        loginPage.completarCamposLogin(user, pass);
    }


    @And("El usuario hace tap en el boton Ingresar")
    public void usuarioTapBotonIngresarLogin() {
        loginPage.tapIngresar();
    }

    @Then("El usuario valida la pantalla Bienvenido a Autoc0de")
    public void theUserVerifiesThatHeWasOnTheWelcomeToAutocDeScreen() {
        loginPage.validarLoginCorrecto();
    }
}
