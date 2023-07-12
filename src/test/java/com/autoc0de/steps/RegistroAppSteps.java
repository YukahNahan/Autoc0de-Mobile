package com.autoc0de.steps;

import com.autoc0de.pages.RegistroAppPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class RegistroAppSteps {

    //PAGE INSTANCE
    RegistroAppPage registroAppPage = new RegistroAppPage();

    @And("^Ingresa datos personales de Usuario: '(.*)' y Apellido '(.*)' y Telefono '(.*)' y Email '(.*)' y Fecha de Nacimiento '(.*)'$")
    public void ingresoDatosUsuario(String nombre, String apellido, String telefono, String email, String fechaNacimiento) {
        registroAppPage.validarRegistroAppCorrecto(nombre,apellido,telefono,email,fechaNacimiento);
    }

    @And("El usuario hace tap en el boton Guardar")
    public void usuarioTapBotonGuardarRegistro() {
        registroAppPage.tapGuardarRegistro();
    }

    @Then("El usuario valida la pantalla de registracion en Autoc0de App")
    public void theUserVerifiesThatHeWasOnTheWelcomeToAutocDeScreen() {
        registroAppPage.validarRegistro();
    }
}
