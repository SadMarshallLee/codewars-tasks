package org.codewars.printererrors;

public class Printer {

    public static void main(String[] args) {
        printerError("asdsd");
    }

    public static String printerError(String s){
        String alphabetErrors = "nopqrstuvwxyz";
        char[] errorsChs = alphabetErrors.toCharArray();
        char[] entryChs = s.toCharArray();
        int count = 0;
        for (char eCh : errorsChs) {
            for (char sCh : entryChs) {
                if (eCh == sCh) {
                    count++;
                }
            }
        }
        int len = s.length();
        String result = count + "/" + len;
        return result;
    }
}
