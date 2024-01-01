package org.example.level1.gymuniform;

import java.util.HashSet;
import java.util.Set;

public class Resolve {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        // 잃어버린 인원을 Set 에 담는다.
        for (int item : lost) {
            lostSet.add(item);            
        }
        
        // 여벌 옷을 가져온 모든 인원에 대해 처리한다.
        for (int item : reserve) {
            // 여벌옷을 가져온 사람이 잃어버린 사람에도 포함 되지 않으면 
            if(!lostSet.contains(item))
                reserveSet.add(item);
            // 포함되는 경우 잃어버린 사람 에서 제외 ( 여벌옷을 잃어버렸기 때문에 1벌로 취급 )  
            else
                lostSet.remove(item);
        }
        
        answer = n - lostSet.size();
        
        // 모든 인원에 대해 처리한다.
        for (int lostMember : lostSet) {
            for(int reserveMember: reserveSet) {
                // 빌려줄수 있는경우 
                if(Math.abs(lostMember - reserveMember) == 1) {
                    // 처리한 친구는 제외한다.
                    reserveSet.remove(reserveMember);
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}
