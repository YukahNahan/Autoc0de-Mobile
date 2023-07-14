package com.autoc0de.utils.actions.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Strings {

    private static final ArrayList<Character> alphabet = new ArrayList<>(
            Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    );
    private static final ArrayList<Character> Strange= new ArrayList<>(
            Arrays.asList(',','?','/',';',':','"','[',']','{','}','=','+','-','_',')','(','*','&','^','%','$','#','@','!','`','~','|','\'')
    );

    public static class Builder {
        private ArrayList<Character> values;
        private Structure structure;
        private boolean containsNumbers = false;
        private boolean containsOnlyNumbers = false;

        private boolean containsStrangeCharacters =false;

        private boolean containsLetterAndStrangeCharacters=false;

        private int size;

        public Builder() {
            values = new ArrayList<>();
        }

        private static char getRandomLetter() {
            return alphabet.get(new Random().nextInt(alphabet.size() - 1));
        }

        private static char getRandomNumber() {
            return Character.forDigit(new Random().nextInt(9), 10);
        }

        private static char getRandonStrange(){return Strange.get(new Random().nextInt(Strange.size()-1));}

        public Builder withSize(int size) {
            this.size = size;
            return this;
        }

        public Builder withStructure(Structure structure) {
            this.structure = structure;
            return this;
        }

        public Builder withNumbers() {
            this.containsNumbers = true;
            return this;
        }

        public Builder withOnlyNumbers() {
            this.containsOnlyNumbers = true;
            return this;
        }
        public Builder withStrangeCaracters(){
            this.containsStrangeCharacters=true;
            return this;
        }
        public Builder withLetterAndStrangeCharacter(){
            this.containsLetterAndStrangeCharacters=true;
            return this;
        }

        @SuppressWarnings("refactor pending")
        public String get() {
            if (containsOnlyNumbers && containsNumbers) {
                throw new RuntimeException("Invalid format, contains only numbers & contains numbers conditions are redundant");
            }

            for (int i = 0; i < this.size; i++) {
                if (!containsOnlyNumbers && !containsNumbers && !containsStrangeCharacters &&!containsLetterAndStrangeCharacters) {
                    values.add(getRandomLetter());
                } else if (containsOnlyNumbers) {
                    values.add(getRandomNumber());
                }else if (containsStrangeCharacters){
                    values.add(getRandonStrange());
                } else if (containsLetterAndStrangeCharacters) {
                    values.add(getRandomLetter());
                    values.add(getRandonStrange());
                } else {
                    values.add(getRandomNumber());
                    containsNumbers = false;
                }

            }

            return (this.structure == null)
                    ? values.stream().map(Object::toString).collect(Collectors.joining())
                    : this.structure.getStructure(values);
        }

    }

    private Strings() {}

}