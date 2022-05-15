package org.codewars.detectpanagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PangramCheckerTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        Assertions.assertTrue(pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        Assertions.assertFalse(pc.check(pangram2));
    }
}