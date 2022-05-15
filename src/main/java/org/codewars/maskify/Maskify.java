package org.codewars.maskify;

public class Maskify {

    public static void main(String[] args) {
        System.out.println(maskify("Skippy"));
    }

    public static String maskify(String str) {
        if (str.length() < 4) return str;
        return (str.substring(0,str.length()-4).replaceAll(".","#") + str.substring(str.length()-4));
    }
}
