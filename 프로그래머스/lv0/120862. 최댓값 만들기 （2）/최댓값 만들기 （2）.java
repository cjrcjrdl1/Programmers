import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        if(numbers[numbers.length-2] * numbers[numbers.length-1] > numbers[0]*numbers[1]){
        answer = numbers[numbers.length-2] * numbers[numbers.length-1];            
        }else{
            answer = numbers[0]*numbers[1];
        }
        return answer;
    }
}