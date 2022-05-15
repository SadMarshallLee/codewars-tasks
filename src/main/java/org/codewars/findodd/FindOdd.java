package org.codewars.findodd;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOdd {
    public static void main(String[] args) {
        int[] a = {1,1,2,-2,5,2,4,4,-1,-2,5};
        findIt(a);
    }

    public static int findIt(int[] a) {
        int odd = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a) {
            list.add(i);
        }
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        for (Map.Entry<Integer, Long> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                odd = e.getKey();
            }
        }
        System.out.println(odd);
        return odd;
    }
}