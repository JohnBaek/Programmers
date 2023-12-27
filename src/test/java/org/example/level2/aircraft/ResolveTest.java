package org.example.level2.aircraft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResolveTest {
    /**
     * 요격 시스템을 테스트한다.
     */
    @DisplayName("요격 시스템 테스트")
    @Test
    void solution() {
        Resolve handler = new Resolve();
        int expect = handler.solution(new int[][]{{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}});
        Assertions.assertEquals(expect,3);
    }
}