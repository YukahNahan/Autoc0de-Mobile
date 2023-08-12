package com.autoc0de.pages;


import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import tests.MasterPage;

public class MainDashboardPage extends MasterPage {

    //PAGE INSTANCE


    //CONSTANTES

    private final String BOTON_CREDENCIAL_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View";

    private final String BOTON_CREDENCIAL_TEXTO_XPATH = "//android.view.View[@content-desc=\"Credencial\"]";

    private final String BOTON_BENEFICIOS_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View";

    private final String BOTON_BENEFICIOS_TEXTO_XPATH = "//android.view.View[@content-desc=\"Beneficios\"]";

    private final String BOTON_DUDAS_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View";

    private final String BOTON_DUDAS_TEXTO_XPATH = "//android.view.View[@content-desc=\"Dudas\"]";

    private final String BOTON_COMUNIDAD_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View";

    private final String BOTON_COMUNIDAD_TEXTO_XPATH = "//android.view.View[@content-desc=\"Comunidad\"]";

    private final String BOTON_SALIR_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View";

    private final String BOTON_SALIR_SI_XPATH = "//android.widget.Button[@content-desc=\"Si\"]";

    private final String BOTON_SALIR_NO_XPATH = "//android.widget.Button[@content-desc=\"No\"]";
    private final String LABEL_EXAMPLE_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View";
    private final String BUTTON_EXAMPLE_ACCESIBILITY_ID = "Iniciar sesión";
    private final String BUTTON_OK_ACCESIBILITY_ID = "Ok";

    private final String USER_INPUT_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]";
    private final String PASS_INPUT_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]";
    private final String BUTTON_ACCESIBILITY_ID = "Iniciar sesión";
    private final String BENEFICIOS = "//android.view.View[@content-desc=\"Beneficios\"]";

    public MainDashboardPage() {
    }

    //FUNCIONES

    public void validarBotonesDashboard(){
        Assert.assertTrue(auto_isElementVisible(By.xpath(BOTON_CREDENCIAL_TEXTO_XPATH)));
        Assert.assertTrue(auto_isElementVisible(By.xpath(BOTON_BENEFICIOS_XPATH)));
        Assert.assertTrue(auto_isElementVisible(By.xpath(BOTON_DUDAS_XPATH)));
        Assert.assertTrue(auto_isElementVisible(By.xpath(BOTON_COMUNIDAD_XPATH)));
        //Assert.assertTrue(auto_isElementVisible(By.xpath(BOTON_SALIR_XPATH)));
    }

    public void validarSalidaApp(){
        auto_setTapElement(MobileBy.xpath(BOTON_SALIR_SI_XPATH));
        Assert.assertTrue(auto_isElementVisible(By.xpath(USER_INPUT_ACCESIBILITY_XPATH)));
        Assert.assertTrue(auto_isElementVisible(By.xpath(PASS_INPUT_ACCESIBILITY_XPATH)));
    }

    public void serviceMethodExampleMainDash(){
    }

    public void serviceMethodExampleMainDashAnd(){
    }

    public void serviceMethodExampleMainDashThen(){
    }
    public void serviceMethodExampleVarMainDash(String var1,String var2){
    }

    public void validarBotonesXpathDashboard(String[] differentValues) {
        for (String value : differentValues) {
            String xpath = String.format("//android.view.View[@content-desc=\"%s\"]", value);
            boolean isElementVisible = auto_isElementVisible(MobileBy.xpath(xpath));
            if (isElementVisible) {
                System.out.println("El elemento con valor '" + value + "' es visible.");
            } else {
                System.out.println("El elemento con valor '" + value + "' no está visible.");
            }
        }
    }

    public void usuarioTapBotonMainDashboard(String elemento) {
        MainDashboardPage.Coordenadas coordenadas = new MainDashboardPage.Coordenadas();
        coordenadas.hacerTapEnElemento(elemento);
    }
}
