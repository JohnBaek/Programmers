package org.example.level2.makebignumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResolveTest {

    @Test
    void solution() {
        Resolve resolve = new Resolve();
//        Assertions.assertEquals("94", resolve.solution("1924",2));
//        Assertions.assertEquals("3234", resolve.solution("1231234",3));
        Assertions.assertEquals("775841", resolve.solution("4177252841",4));
    }
}