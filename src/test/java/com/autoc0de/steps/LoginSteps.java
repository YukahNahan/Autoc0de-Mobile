package com.autoc0de.steps;

import com.autoc0de.generic.GenService;
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
        loginPage.validarOmitirSlidesLoginScreen();
    }
    @Given("El usuario esta en la pantalla de Bienvenida de la aplicacion Underc0de")
    public void pantallaBienvenidaApp() {
        loginPage.validarBienvenidaSlidesScreen();
    }

    @Given("El usuario esta en la APP Underc0de")
    public void backgroundInicioApp() {
        loginPage.validarOmitirSlidesLoginScreen();
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

    @And( "El usuario hace scroll horizontal y valida desplazamiento de Slides" )
    public void scrollHorizontalContenido() {
        loginPage.contenidoScrollHorizontalSlides();
    }

    @And("El usuario hace tap en el boton Necesitas Ayuda?")
    public void usuarioTapBotonAyudaLogin() {
        loginPage.tapAyuda();
    }

    @Then("El usuario valida resultado de login en App Underc0de")
    public void theUserVerifiesThatHeWasOnTheWelcomeToAutocDeScreen() {
        loginPage.validarLoginCorrecto();
    }
}
