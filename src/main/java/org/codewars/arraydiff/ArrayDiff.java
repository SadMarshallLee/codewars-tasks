package org.codewars.arraydiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> aList = new ArrayList<>();
        for (int i : a) aList.add(i);
        List<Integer> bList = new ArrayList<>();
        for (int i : b) bList.add(i);
        aList.removeAll(bList);
        int[] result = aList.stream().mapToInt(i -> i).toArray();
        Arrays.stream(result).forEach(System.out::println);
        return result;
    }
}
