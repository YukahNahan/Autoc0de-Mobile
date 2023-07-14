package com.autoc0de.constantes;


import com.autoc0de.annotations.Target;

public class GenericPageConstants {

    private GenericPageConstants() {}

    public static final String SIMPLE_SPAN                         = "xpath://span[text() = '%s']";


    public static final String SPAN                                = "xpath:(//*[not(name()='script') and contains(text(), '%s')])[last()]";
    public static final String NAVBAR                              = "xpath://*[contains(@title, '.AppBar_appbar__button__')]";

    public static final String BOTON_CON_TEXTO                     = "xpath://*[contains(text(), '%s')]";


    @Target("EXAMPLE")
    public static final String EXAMPLE_ELEMENT01                               = "";

}