package com.autoc0de.pages;


import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import tests.MasterPage;

public class RegistroAppPage extends MasterPage {

    //PAGE INSTANCE


    //CONSTANTES
    private final String NOMBRE_INPUT_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]";

    private final String APELLIDO_INPUT_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]";

    private final String TELEFONO_INPUT_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]";

    private final String EMAIL_INPUT_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[4]";

    private final String BUTTON_FECHANAC_ACCESIBILITY_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View";

    private final String BUTTON_SELECCAÑO_ACCESIBILITY_XPATH = "//android.widget.Button[@content-desc=\"Seleccionar año\"]";

    private final String BUTTON_SELECCANIO_ACCESIBILITY_XPATH = "//android.view.View[@content-desc=\"1981\"]";

    private final String BUTTON_EDITARFECHA_ACCESIBILITY_XPATH = "//android.widget.Button[@content-desc=\"Cambiar a cuadro de texto\"]";

    private final String FECHA_INPUT_CLASSNAME = "android.widget.EditText";

    private final String FECHA_FORMATO_NOVALIDO_ACCESIBILITY_XPATH = "//android.view.View[@content-desc=\"Formato no válido.\"]";

    private final String FECHA_INPUT_TEXT = "Introduce una fecha\n" + "mm/dd/aaaa";

    private final String BUTTON_ACEPTARFECHA_ACCESIBILITY_XPATH = "//android.widget.Button[@content-desc=\"ACEPTAR\"]";

    private final String BUTTON_CANCELARFECHA_ACCESIBILITY_XPATH = "//android.widget.Button[@content-desc=\"CANCELAR\"]";

    private final String BUTTON_GUARDAR_REGISTRO_ACCESIBILITY_XPATH = "//android.widget.Button[@content-desc=\"Guardar\"]";

    private final String BUTTON_GUARDAR_REGISTRO_ACCESIBILITY_ID = "Guardar";

    private final String RESULT_LABEL_ERROR_REGISTER_ACCESIBILITY_ID = "Error al guardar No has completado todos los campos. Por favor no seas tan...";

    private final String BUTTON_OK_RETURNREGISTER_ACCESIBILITY_XPATH = "//android.widget.Button[@content-desc=\"Ok\"]";

    private final String LABEL_ID_ERROR_REGISTRO_ACCESIBILITY_XPATH = "//android.view.View[@content-desc=\"Error al guardar\n" +
            "No has completado todos los campos.\n" +
            "Por favor no seas tan...\"]";
    private final String RESULT_LABEL_ACCESIBILITY1_ID = "Error al ingresar No has ingresado un nombre de usuario ni contraseña. Por favor no seas tan...";
    private final String RESULT_LABEL_ACCESIBILITY2_ID = "Error al ingresar No has ingresado una contraseña. Por favor que no vuelva a pasar...";
    private final String RESULT_LABEL_ACCESIBILITY3_ID = "Error al ingresar No has ingresado un nombre de usuario. Usted no entiende verdad?";
    private final String RESULT_LABEL_ACCESIBILITY4_ID = "Oops... No puede ser que no tengas usuario en el Foro! Por favor, te das el honor?";

    private final String CONTENT_XPATH = "//android.view.View[@content-desc=\"NIVEL 1\"]";

    public RegistroAppPage() {
    }

    //FUNCIONES

    public void validarRegistroAppCorrecto(String nombre, String apellido, String telefono, String email, String fechaNacimiento){
        auto_setTapElement(MobileBy.xpath(NOMBRE_INPUT_ACCESIBILITY_XPATH));
        auto_setTextToInput(By.xpath(NOMBRE_INPUT_ACCESIBILITY_XPATH), nombre);
        auto_setTapElement(MobileBy.xpath(APELLIDO_INPUT_ACCESIBILITY_XPATH));
        auto_setTextToInput(By.xpath(APELLIDO_INPUT_ACCESIBILITY_XPATH), apellido);
        auto_setTapElement(MobileBy.xpath(TELEFONO_INPUT_ACCESIBILITY_XPATH));
        auto_setTextToInput(By.xpath(TELEFONO_INPUT_ACCESIBILITY_XPATH), telefono);
        auto_setTapElement(MobileBy.xpath(EMAIL_INPUT_ACCESIBILITY_XPATH));
        auto_setTextToInput(By.xpath(EMAIL_INPUT_ACCESIBILITY_XPATH), email);
        auto_setTapElement(MobileBy.xpath(BUTTON_FECHANAC_ACCESIBILITY_XPATH));
        auto_setTapElement(MobileBy.xpath(BUTTON_EDITARFECHA_ACCESIBILITY_XPATH));
        auto_setTextToInput(By.className(FECHA_INPUT_CLASSNAME), fechaNacimiento);
        auto_setTapElement(MobileBy.xpath(BUTTON_ACEPTARFECHA_ACCESIBILITY_XPATH));
    }

    public void tapGuardarRegistro(){
        Assert.assertTrue(auto_isElementVisible(By.xpath(BUTTON_GUARDAR_REGISTRO_ACCESIBILITY_XPATH)));
        auto_setTapElement(MobileBy.xpath(BUTTON_GUARDAR_REGISTRO_ACCESIBILITY_XPATH));
    }

    public void validarRegistro(){
        boolean isErrorVisible = auto_isElementVisible(By.xpath(LABEL_ID_ERROR_REGISTRO_ACCESIBILITY_XPATH));
        Assert.assertTrue(isErrorVisible ? isErrorVisible : auto_isElementVisible(By.xpath(CONTENT_XPATH)));
    }

}
