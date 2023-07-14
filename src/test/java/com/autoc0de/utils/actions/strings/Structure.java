package com.autoc0de.utils.actions.strings;

import java.util.ArrayList;

public enum Structure {

    MAYUS {
        @Override
        public String getStructure(ArrayList<Character> values) {
            String finalValues = "";
            for (Character value: values) {
                finalValues = finalValues.concat(String.valueOf(value).toUpperCase());
            }

            return finalValues;
        }
    },

    MINUS {
        @Override
        public String getStructure(ArrayList<Character> values) {
            String finalValues = "";
            for (Character value: values) {
                finalValues = finalValues.concat(String.valueOf(value).toLowerCase());
            }

            return finalValues;
        }
    },

    MIXED {
        @Override
        public String getStructure(ArrayList<Character> values) {
            String finalValues = "";
            Character previousValue = null;
            for (Character value: values) {
                if (previousValue != null) {
                    if (Character.isLowerCase(previousValue))
                        previousValue = Character.toUpperCase(value);
                    else previousValue = Character.toLowerCase(value);
                } else previousValue = value;
                finalValues = finalValues.concat(String.valueOf(previousValue));
            }

            return finalValues;
        }
    };

    abstract String getStructure(ArrayList<Character> values);

}