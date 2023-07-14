package com.autoc0de.exceptions;

import org.testng.log4testng.Logger;

public class InexistentVariableException extends RuntimeException {

    public InexistentVariableException(String variable) {
        Logger.getLogger( this.getClass() ).error( String.format( "Variable %s not found", variable ) );
    }

}