package org.codewars.detectpanagram;

import java.util.*;

public class PangramChecker {

    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        pangramChecker.check("Oleg");
    }

    public boolean check(String sentence){
        boolean check = true;
        String str = sentence.toLowerCase();
        List<Character> abc = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) abc.add(ch);
        List<Character> phrase = new ArrayList<>();
        for (char ch : str.toCharArray())  phrase.add(ch);

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : abc) {
            map.put(ch, 0);
        }
        for (char ch : phrase) {
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (ch == e.getKey()) {
                    map.put(e.getKey(), e.getValue() + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 0) {
                check = false;
            }
        }
        System.out.println(map);
       return check;
    }
}