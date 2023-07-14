package com.autoc0de.exceptions;

public class EnumException extends RuntimeException {

    public EnumException(String property ) {
        super( "Property " + property + " not found" );
    }

}
