package org.codewars.maskify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaskifyTest {

    @Test
    public void testSolution() {
        Assertions.assertEquals("############5616", Maskify.maskify("4556364607935616"));
        Assertions.assertEquals("#######5616", Maskify.maskify(     "64607935616"));
        Assertions.assertEquals("1", Maskify.maskify(               "1"));
        Assertions.assertEquals("", Maskify.maskify(                ""));

        //Assertions.assertEquals("##ippy", Maskify.maskify("Skippy"));
        Assertions.assertEquals("####################################man!", Maskify.maskify("Nananananananananananananananana Batman!"));
    }

}