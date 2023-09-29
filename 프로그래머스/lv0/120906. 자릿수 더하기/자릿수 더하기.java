import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // while(n>0){
        //     answer += n%10;
        //     n/=10;
        // }
        
        String str = String.valueOf(n);
        for(char x : str.toCharArray()){
            answer += Character.getNumericValue(x);
        }
        return answer;
        // return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}