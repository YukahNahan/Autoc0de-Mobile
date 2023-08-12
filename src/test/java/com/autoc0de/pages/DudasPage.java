package com.autoc0de.pages;


import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import tests.MasterPage;

import java.util.regex.Pattern;

public class DudasPage extends MasterPage {

    //PAGE INSTANCE


    //CONSTANTES

    private final String CONTENEDOR_DUDAS_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View";
    private final Pattern POST_PATTERN = Pattern.compile("^(.+)\\s+Iniciado por\\s+(.+)$");
    private final String POST_EXAMPLE_XPATH = "//android.view.View[@content-desc=\"TituloPosteoIniciado\n" +
            "Iniciado por UsuarioForo\"]";

    private final String BOTON_AGREGAR_POST = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";

    private final String TITULO_AGREGAR_POST = "Crear nuevo tema";

    private final String INPUT_TITULO_POST = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";

    private final String INPUT_MENSAJE_POST = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";

    private final String BOTON_PUBLICAR_POST = "Publicar";

    private final String BOTON_ATRAS_DUDAS = "Atrás";

    public DudasPage() {
    }

    //FUNCIONES

    public void validarEntradasDudasExample(){
        Assert.assertTrue(auto_isElementVisible(By.xpath(CONTENEDOR_DUDAS_XPATH)));
    }

    public boolean validarEntradasDudas() {
//        Assert.assertTrue(auto_isElementVisible(By.xpath(CONTENEDOR_DUDAS_XPATH)));
//        List<WebElement> listaItems = auto_getElementText(By.xpath(CONTENEDOR_DUDAS_XPATH));
//
//        if (!listaItems.isEmpty()) {
//            for (WebElement item : listaItems) {
//                String itemText = item.getAttribute("content-desc");
//                if (itemText != null) {
//                    Matcher matcher = POST_PATTERN.matcher(itemText);
//                    if (matcher.matches()) {
//                        String tituloPosteo = matcher.group(1).trim();
//                        String usuarioForo = matcher.group(2).trim();
//
//                        String expectedText = tituloPosteo + "\nIniciado por " + usuarioForo;
//                        String actualText = item.getText();
//
//                        if (expectedText.equals(actualText)) {
//                            return true;  // Datos coinciden
//                        }
//                    }
//                }
//            }
//        }
//
//        return false;  // No se encontró ningún elemento que cumpla con el formato
        return false;
    }

    public void tapAgregarDuda(){
        auto_setTapElement(MobileBy.xpath(BOTON_AGREGAR_POST));
    }

    public void validarModuloPublicarDudas(){
        Assert.assertTrue(auto_isElementVisible(MobileBy.AccessibilityId(TITULO_AGREGAR_POST)));
        Assert.assertTrue(auto_isElementVisible(MobileBy.xpath(INPUT_TITULO_POST)));
        Assert.assertTrue(auto_isElementVisible(MobileBy.xpath(INPUT_MENSAJE_POST)));
        Assert.assertTrue(auto_isElementVisible(MobileBy.AccessibilityId(BOTON_PUBLICAR_POST)));
//        auto_setTapElement(MobileBy.AccessibilityId(BOTON_ATRAS_DUDAS));
    }
}
