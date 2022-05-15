package org.codewars.arraydiff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayDiffTest {

    @Test
    public void sampleTests() {
        Assertions.assertArrayEquals(new int[] {2}, ArrayDiff.arrayDiff(new int [] {1,2}, new int[] {1}));
        Assertions.assertArrayEquals(new int[] {2,2}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        Assertions.assertArrayEquals(new int[] {1}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        Assertions.assertArrayEquals(new int[] {1,2,2}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {}));
        Assertions.assertArrayEquals(new int[] {}, ArrayDiff.arrayDiff(new int [] {}, new int[] {1,2}));
    }
}