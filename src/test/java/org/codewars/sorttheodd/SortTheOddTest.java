package org.codewars.sorttheodd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTheOddTest {

    @Test
    public void exampleTest1() {
        Assertions.assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        Assertions.assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortTheOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        Assertions.assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }
}