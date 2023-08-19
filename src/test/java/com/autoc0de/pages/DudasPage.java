package com.autoc0de.pages;

import com.autoc0de.gpt3turbo.*;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import tests.MasterPage;

import java.util.regex.Pattern;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DudasPage extends MasterPage {
    public static final ThreadLocal<String> tituloPostThreadLocal = new ThreadLocal<>();
    public static final ThreadLocal<String> mensajePostThreadLocal = new ThreadLocal<>();
    public static final ThreadLocal<String> respuestaPostThreadLocal = new ThreadLocal<>();
    private static final String API_KEY = "";
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
    private final String INPUT_RESPUESTA_POST = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText";
    private final String BOTON_PUBLICAR_POST = "Publicar";

    private final String BOTON_ACEPTAR_POST = "Aceptar";
    private final String BOTON_PUBLICAR_RESPUESTA = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";

    private final String BOTON_POST_PUBLICADO = "//android.view.View[@content-desc="+tituloPostThreadLocal.get()+
            "Iniciado por ZxXxA_autoc0deReg01\"]";

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

    public void validarConsultaPublicada() throws OpenAIGPTException {
        OpenAIChatGPT chatbot = new OpenAIChatGPT(API_KEY);

        ChatCompletionRequestBody request = new ChatCompletionRequestBody();
        request.setTemperature(1);
        request.setModel("gpt-3.5-turbo");
        request.addMessage(new ChatMessage("system", "Genera una pregunta sobre la Comunidad Underc0de, responda con esa pregunta cuando se le solicite."));
        request.addMessage(new ChatMessage("user", "¿Cual es la pregunta que harías referida a la Comunidad Underc0de?"));

        CompletionResponse response = chatbot.complete(request);
        assertNotNull(response);
        assertTrue(response.getContent().contains("Underc0de"));
        String tituloGenerado = response.getContent().replaceAll("^\"|\"$", ""); // Obtener el contenido del atributo "content" de la respuesta
        tituloPostThreadLocal.set(tituloGenerado);
        auto_setTapElement(MobileBy.xpath(INPUT_TITULO_POST));
        auto_setTextToInput(By.xpath(INPUT_TITULO_POST), tituloPostThreadLocal.get());
        System.out.println("Título generado: " + tituloPostThreadLocal.get());
        auto_setTapElement(MobileBy.xpath(INPUT_MENSAJE_POST));
        ChatCompletionRequestBody requestMensaje = new ChatCompletionRequestBody();
        requestMensaje.setTemperature(1);
        requestMensaje.setModel("gpt-3.5-turbo");
        requestMensaje.addMessage(new ChatMessage("system", tituloPostThreadLocal.get()));
        requestMensaje.addMessage(new ChatMessage("user", "Describe particularidades del framework"));

        CompletionResponse responseMensaje = chatbot.complete(requestMensaje);
        assertNotNull(responseMensaje);
        assertTrue(responseMensaje.getContent().contains("Underc0de"));
        String mensajeGenerado = responseMensaje.getContent().replaceAll("^\"|\"$", "");
        mensajePostThreadLocal.set(mensajeGenerado);
        auto_setTapElement(MobileBy.xpath(INPUT_MENSAJE_POST));
        auto_setTextToInput(By.xpath(INPUT_MENSAJE_POST), mensajePostThreadLocal.get());
        System.out.println("Cuerpo de Mensaje generado: " + mensajePostThreadLocal.get());
        auto_setTapElement(MobileBy.AccessibilityId(BOTON_PUBLICAR_POST));
        auto_setTapElement(MobileBy.AccessibilityId(BOTON_ACEPTAR_POST));
    }

    public void validarRespuestaPublicada() throws OpenAIGPTException {
        auto_setTapElement(MobileBy.xpath(INPUT_RESPUESTA_POST));
        OpenAIChatGPT chatbot = new OpenAIChatGPT(API_KEY);

        ChatCompletionRequestBody request = new ChatCompletionRequestBody();
        request.setTemperature(1);
        request.setModel("gpt-3.5-turbo");
        request.addMessage(new ChatMessage("system", "Genera una respuesta al siguiente post, responda extendiendo informacion cuando se le solicite." + mensajePostThreadLocal.get()));
        request.addMessage(new ChatMessage("user", "¿Cuál es su aporte al siguiente articulo sobre la Comunidad Hacking Underc0de?"));

        CompletionResponse response = chatbot.complete(request);
        assertNotNull(response);
        assertTrue(response.getContent().contains("Underc0de"));
        String respuestaGenerada = response.getContent().replaceAll("^\"|\"$", ""); // Obtener el contenido del atributo "content" de la respuesta
        respuestaPostThreadLocal.set(respuestaGenerada);
        auto_setTapElement(MobileBy.xpath(INPUT_RESPUESTA_POST));
        auto_setTextToInput(By.xpath(INPUT_RESPUESTA_POST), respuestaPostThreadLocal.get());
        System.out.println("Respuesta generada: " + respuestaPostThreadLocal.get());
        auto_setTapElement(MobileBy.xpath(BOTON_PUBLICAR_RESPUESTA));
    }
}
