package org.example.level1.gymuniform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResolveTest {
    @Test
    void solution() {
        Resolve resolve = new Resolve();
        Assertions.assertEquals(5,resolve.solution(5 , new int[]{ 2, 4} , new int[]{ 1,3,5}));
        Assertions.assertEquals(4,resolve.solution(5 , new int[]{ 2, 4} , new int[]{ 3 }));
        Assertions.assertEquals(2,resolve.solution(3 , new int[]{ 3 } , new int[]{ 1 }));
    }
}