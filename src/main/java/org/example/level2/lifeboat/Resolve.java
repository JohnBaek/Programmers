package org.example.level2.lifeboat;

import java.util.Arrays;

public class Resolve {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int left = 0;
        int right = people.length- 1;
        int onBoat = 0;
        
        while(onBoat != people.length) {
            if(left == right) {
                onBoat++;
            }else {
                if((people[left] + people[right]) <= limit){
                    left++;
                    right--;
                    onBoat += 2;
                }
                else {
                    right--;
                    onBoat++;
                }
            }
            
            answer++;
        }

        return answer;
    }
}
