package com.autoc0de.generic;

import com.autoc0de.exceptions.EnumException;



public enum Assertions {

    EXAMPLE_METHOD_TARGET {
        @Override
        public void execute() {
        }
    };

    public abstract void execute() throws InterruptedException;

    public static Assertions getValue(String property) {
        try {
            return valueOf( property );
        } catch ( IllegalArgumentException ex ) {
            throw new EnumException( property );
        }
    }

}
