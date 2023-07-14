package com.autoc0de.exceptions;

import org.testng.log4testng.Logger;

public class InexistentAnnotationException extends RuntimeException {

    public InexistentAnnotationException(String annotation) {
        Logger.getLogger(this.getClass()).error(String.format("Annotation %s not found", annotation));
    }

}