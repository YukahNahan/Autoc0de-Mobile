package com.autoc0de.steps;

import com.autoc0de.gpt3turbo.OpenAIGPTException;
import com.autoc0de.pages.DudasPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DudasSteps {

    //PAGE INSTANCE
    DudasPage dudasPage = new DudasPage();

    @When("Verifica entradas registradas")
    public void validarEntradasPost() {
        dudasPage.validarEntradasDudas();
    }

    @And("Verifica formulario publicar posteo")
    public void validarFormularioPublicar() {
        dudasPage.validarModuloPublicarDudas();
    }

    @And("Publica nueva consulta")
    public void validarConsultaPublicada() throws OpenAIGPTException {
        dudasPage.validarConsultaPublicada();
    }

    @And("Comenta en la consulta realizada de forma correcta")
    public void validarRespuestaPublicada() throws OpenAIGPTException {
        dudasPage.validarRespuestaPublicada();
    }



    @Given("dudas...x")
    public void metodoStepBasicoDudas() {
        //dudasPage.serviceMethodExampleDudas();
    }

    @When("^dudas  '(.*)'    '(.*)'$")
    public void metodoStepBasicoVarDudas(String var1, String var2) {
        //dudasPage.serviceMethodExampleVarDudas(var1, var2);
    }


    @And("dudas ")
    public void metodoStepBasicoDudasAnd() {
        //dudasPage.serviceMethodExampleDudasAnd();
    }

    @Then("dudas....")
    public void metodoStepBasicoDudasThen() {
        //dudasPage.serviceMethodExampleDudasThen();
    }

    @And("^Hace tap sobre el tema '(.*)'")
    public void usuarioTapBotonesDudas(String elemento) {
        //dudasPage.usuarioTapBotonModuloDudas(elemento);
    }

    @And("El usuario hace tap en el boton Agregar Duda")
    public void usuarioTapBotonIngresarLogin() {
        dudasPage.tapAgregarDuda();
    }
}
