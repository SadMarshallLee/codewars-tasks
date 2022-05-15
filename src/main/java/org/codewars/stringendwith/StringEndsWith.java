package org.codewars.stringendwith;

public class StringEndsWith {

    public static boolean solution(String str, String ending) {
        int endLen = ending.length();
        String sub;
        if (str.length() >= endLen) {
            sub = str.substring(str.length() - endLen);
        } else {
            return false;
        }
        return sub.equals(ending);
    }
}
