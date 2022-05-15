package org.codewars.sorttheodd;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] % 2 == 1 && array[j] % 2 == 1 && array[i] > array[j]) {
                    var temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
