package org.codewars.multiplesofthreeorfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplesOfThreeOrFiveTest {

    @Test
    public void test() {
        Assertions.assertEquals(23, new MultiplesOfThreeOrFive().solution(10));
    }

}