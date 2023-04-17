import java.util.*;
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int x : numbers){
            answer +=x;
        }
            answer /=numbers.length;
        return answer;
        // return Arrays.stream(numbers)
        //     .average()
        //     .orElse(0);
    }
}