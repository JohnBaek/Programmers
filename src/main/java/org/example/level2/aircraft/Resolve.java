package org.example.level2.aircraft;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181188
 * 요격 시스템
 */
public class Resolve {
    /**
     * 솔루션 
     * @param targets 요격할 타겟
     * @return 최소 요격 가능 횟수 
     */
    public int solution(int[][] targets) {
        int answer = 0;
        
        // Greedy 를 쓰기위해 가장 비용이 마지막 거리 중심으로 오름차순으로 정렬한다.
        Arrays.sort(targets, (Comparator.comparingInt(a -> a[1])));
        int previous = -1;
        
        // 모든 타겟에 대해 처리한다.
        for (int[] target : targets) {
            if(previous <= target[0] ) {
                previous = target[1];
                answer++;
            }
        }
        
        return answer;
    }
}
