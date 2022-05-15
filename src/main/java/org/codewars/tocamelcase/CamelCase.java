package org.codewars.tocamelcase;

import java.util.Arrays;

public class CamelCase {

    static String toCamelCase(String s){
        String[] words = s.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .reduce(words[0], String::concat);
    }
}
