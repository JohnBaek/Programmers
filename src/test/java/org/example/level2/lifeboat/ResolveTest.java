package org.example.level2.lifeboat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ResolveTest {

    @Test
    void solution() {
        Resolve resolve = new Resolve();
        Assertions.assertEquals(3,resolve.solution(new int[] {70, 50, 80, 50},100));
        Assertions.assertEquals(3,resolve.solution(new int[] {70, 50, 80},100));
    }
}