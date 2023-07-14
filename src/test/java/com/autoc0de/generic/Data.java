package com.autoc0de.generic;


import com.autoc0de.exceptions.EnumException;

public enum Data {

    EXAMPLE_PROP {
        @Override
        public String getData() {
            return null;
        }
    };

    abstract String getData();

    public static Data getData( String property ) {
        try {
            property = property.substring( 1, property.length() - 1 ); // example: [LOGGED_EMAIL] -> get LOGGED_EMAIL
            return valueOf( property );
        } catch ( IllegalArgumentException ex ) {
            throw new EnumException( property );
        }
    }

}