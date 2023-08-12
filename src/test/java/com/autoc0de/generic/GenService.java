package com.autoc0de.generic;

import com.autoc0de.constantes.GenericPageConstants;
import com.autoc0de.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.*;
import org.testng.Assert;
import tests.MasterPage;


public class GenService {

    private GenService() {}

    private static WebDriver driverInstance;
    public static RemoteWebDriver driver = null;

    public void genServiceDriverInstance(WebDriver driverInstance) {
        this.driverInstance = driverInstance;
    }

//    public static void visualize( String variable ) {
//        String locator = Utils.processLocator( variable );
//        Assert.assertTrue(
//                Utils.isDisplayedFromTargetDynamicTimeout( locator )
//        );
//    }
//
//    public static void notVisualize( String variable ) {
//        String locator = Utils.processLocator( variable );
//        Assert.assertTrue(
//                Utils.isNotDisplayedFromTargetDynamicTimeout( locator, 20 )
//        );
//    }
//
//    public static void assertBetween( String variable, String expectedResult ) {
//        String locator = Utils.processLocator( variable );
//        if ( expectedResult.startsWith( "[" ) )
//            expectedResult = Data.getData( expectedResult ).getData();
//        Assert.assertEquals(
//                Utils.getTextFromTargetDynamicTimeout( locator ), expectedResult
//        );
//    }

    public static void assertionFor( String target ) throws InterruptedException {
        Assertions.getValue( target ).execute();
    }

//    public static void verifyIfIsDisplayed(String locator) {
//        Utils.isDisplayedFromTargetDynamicTimeout(locator, 60);
//    }
//
//    public static void verifyIsNotDisplayed(String locator) {
//        Utils.isNotDisplayedFromTargetDynamicTimeout(locator, 60);
//    }
//
//    public static void verificaTexto(String text) {
//        Utils.isDisplayedFromTargetDynamicTimeout(String.format(GenericPageConstants.SPAN, text));
//    }
//
//    public static void verificaNumero(int numeroId) {
//        Utils.isDisplayedFromTargetDynamicTimeout(String.format(GenericPageConstants.SPAN, numeroId));
//    }

    public static void esperaDebugg(int segundos) {
        try {
            Thread.sleep(segundos * 800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void contenidoScroll() {
        int startX = 0;
        int startYBefore = 200;
        int endX = 0;
        int endYBefore = -800;

        // Obtener la posición Y antes del scroll
        startYBefore = 200;

        MasterPage.auto_genericScroll(startX, startYBefore, endX, endYBefore);

        // Verificar si el contenido se ha desplazado
        boolean contentScrolled = GenService.isContentScrolled(startYBefore, endYBefore);
        Assert.assertTrue(contentScrolled, "El contenido no se desplazó como se esperaba.");
    }

    private static boolean isContentScrolled(int startYBefore, int endYBefore) {
        int startYAfter = 0;
        int endYAfter = 200;

        return startYAfter != startYBefore || endYAfter != endYBefore;
    }
}