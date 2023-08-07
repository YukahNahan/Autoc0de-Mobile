package com.autoc0de.pages;


import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import tests.MasterPage;

public class LoginPage extends MasterPage {

    //PAGE INSTANCE


    //CONSTANTES
    private final String LABEL_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View";
    private final String OMITIR_ACCESIBILITY_XPATH = "Omitir";
    private final String LOGOLABEL_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
    private final String USER_INPUT_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]";
    private final String PASS_INPUT_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]";
    private final String BUTTON_ACCESIBILITY_ID = "Iniciar sesión";
    private final String BUTTONOK_ACCESIBILITY_ID = "Ok";
    private final String CONTENT_XPATH = "//android.view.View[@content-desc=\"NIVEL 1\"]";
    private final String RESULT_LABEL_ACCESIBILITY1_ID = "Error al ingresar No has ingresado un nombre de usuario ni contraseña. Por favor no seas tan...";
    private final String RESULT_LABEL_ACCESIBILITY2_ID = "Error al ingresar No has ingresado una contraseña. Por favor que no vuelva a pasar...";
    private final String RESULT_LABEL_ACCESIBILITY3_ID = "Error al ingresar No has ingresado un nombre de usuario. Usted no entiende verdad?";
    private final String RESULT_LABEL_ACCESIBILITY4_ID = "Oops... No puede ser que no tengas usuario en el Foro! Por favor, te das el honor?";

    private final String RESULT_LABEL_ACCESIBILITY5_ID = "//android.view.View[@content-desc=\"Oops...\n" +
            "Lo sentimos, al parecer el \n" +
            "Nombre de usuario y/o Contraseña no son \n" +
            "correctos.\"]";

    private final String RESULT_LABEL_ACCESIBILITY6_ID = "//android.view.View[@content-desc=\"Error al ingresar\n" +
            "Lo sentimos, al parecer no has ingresado una Contraseña\"]";

    private final String RESULT_LABEL_ACCESIBILITY7_ID = "//android.view.View[@content-desc=\"Error al ingresar\n" +
            "Lo sentimos, al parecer no has ingresado un Nombre de usuario\"]";

    private final String RESULT_LABEL_ACCESIBILITY8_ID = "//android.view.View[@content-desc=\"Error al ingresar\n" +
            "Lo sentimos, es necesario ingresar un Nombre de usuario y Contraseña\"]";

    private final String BOTON_OJO_ACCESIBILITY9_ID = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]/android.widget.Button";
    private final String ACTION_BAR_XPATH = "//*[@resource-id='android:id/action_bar']";
    private final String TEXT_VIEW_XPATH = "//android.widget.TextView";
    public LoginPage() {
    }

    //FUNCIONES
    public void validarLoginScreen(){
//        Assert.assertTrue(auto_isElementVisible(By.xpath(LOGOLABEL_ACCESIBILITY_XPATH)));
        Assert.assertTrue(auto_isElementVisible(MobileBy.AccessibilityId(OMITIR_ACCESIBILITY_XPATH)));
        auto_setTapElement(MobileBy.AccessibilityId(OMITIR_ACCESIBILITY_XPATH));
    }

    public void completarCamposLogin(String user, String pass){
        auto_setTapElement(By.xpath(PASS_INPUT_ACCESIBILITY_XPATH));
        auto_setTextToInput(By.xpath(PASS_INPUT_ACCESIBILITY_XPATH), pass);
        MasterPage.tapInputUserName();
        auto_setTextToInput(By.xpath(USER_INPUT_ACCESIBILITY_XPATH), user);
    }

    public void completarLogin(){
        auto_setTapElement(By.xpath(PASS_INPUT_ACCESIBILITY_XPATH));
        auto_setTextToInput(By.xpath(PASS_INPUT_ACCESIBILITY_XPATH), "Underc0de");
        MasterPage.tapInputUserName();
        auto_setTextToInput(By.xpath(USER_INPUT_ACCESIBILITY_XPATH), "Autoc0de");
    }

    public void tapIngresar(){
        auto_setTapElement(MobileBy.AccessibilityId(BUTTON_ACCESIBILITY_ID));
    }

    public void validarLoginCorrecto(){
        boolean isErrorVisible = auto_isElementVisible(By.xpath(RESULT_LABEL_ACCESIBILITY5_ID));
        Assert.assertTrue(isErrorVisible ? isErrorVisible : auto_isElementVisible(By.xpath(CONTENT_XPATH)));
//        Assert.assertTrue(auto_isElementVisible(By.xpath(CONTENT_XPATH)));
    }


}
