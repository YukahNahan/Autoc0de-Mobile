package com.autoc0de.steps;
import com.autoc0de.generic.*;
import com.autoc0de.generic.Assertions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GenericosSteps {

//    @Then( "^El usuario debe visualizar '(.*)'(?:.*)$" )
//    public void visualize( String variable ) {
//        GenService.visualize( variable );
//    }

//    @Then( "^El usuario no debe visualizar '(.*)'$" )
//    public void notVisualize( String variable ) {
//        GenService.notVisualize( variable );
//    }


//    @When("^Hace click en (.*)$")
//    public void clicks(String target) throws IllegalAccessException {
//        String lResolver = new MultiReflection.Builder()
//                .scanPackages("com.autoc0de.constantes")
//                .scanFields()
//                .withAnnotationReveal(target)
//                .build();
//        auto_getWait(lResolver).click();
//        MasterPage.auto_setTapElement(By.id(lResolver));
//    }

//    @Then( "^El usuario verifica que '(.*)' contra '(.*)'$" )
//    public void assertBetween( String variable, String expectedResult ) {
//        actionFor( variable, expectedResult, Actions.assertBetween );
//        GenService.assertBetween( variable, expectedResult );
//    }

    @And( "^Se valida que '(.*)' (?:.*)" )
    public void assertion( String target ) throws InterruptedException {
        GenService.assertionFor( target );
    }
    @And("^Se verifica '(.*)'(?:.*) (.*)$")
    public void assertion(String target, String Environment) throws InterruptedException {
//        GenService.validarRespuestas(target, Environment);
    }

    @And("^Se verifica que '(.*)'(?:.*)$")
    public void assertionTarget(String target)  {
        try {
            Assertions.getValue(target).execute();
        } catch (InterruptedException e) {
            throw new IllegalArgumentException("Target no reconocido: " + target);
        }
    }

    @When( "^...$" )
    public void ignore(String BASE_URL) {
//        MasterPage.auto_openURLInBrowser(BASE_URL);
    }

    @Then("^Se verifica el texto '(.*)'(?:.*)$")
    public void verificacionTexto(String text) {
//        GenService.verificaTexto(text);
    }

    @Then("^Se verifica numero '(.*)'(?:.*)$")
    public void verificacionNumero(int numeroId) {
//        GenService.verificaNumero(numeroId);
    }

    @And( "^Se visualiza '(.*)'(?:.*)$" )
    public void visualizeOn( String variable ) {
//        GenService.visualize( variable );
    }

    @And( "^Valida que '(.*)'(?:.*)$" )
    public void validateOn( String variable )  {
//        GenService.visualize( variable );
    }

    @And( "^Se cierra el '(.*)'(?:.*)$" )
    public void visualizeNot( String variable ) {
//        GenService.notVisualize( variable );
    }

    @And( "El usuario hace scroll vertical y valida desplazamiento" )
    public void scrollVerticalContenido() {
        GenService.contenidoScrollVertical();
    }

    @And( "El usuario hace scroll horizontal y valida desplazamiento" )
    public void scrollHorizontalContenido() {
        GenService.contenidoScrollHorizontal();
    }


}
