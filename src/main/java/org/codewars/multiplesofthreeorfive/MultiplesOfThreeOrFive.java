package org.codewars.multiplesofthreeorfive;

public class MultiplesOfThreeOrFive {

    public int solution(int number) {
        int sum = 0;
        if (number >= 0) {
            for (int i = 0; i < number; i++) {
                if (i % 3 == 0 || i % 5 ==0) {
                    sum = sum + i;
                }
            }
        } else {
            return 0;
        }
        return sum;
    }
}
