import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int x : array){
            if(x==n) answer++;
        }
        // return (int)Arrays.stream(array).filter(i -> i==n).count();
        return answer;
    }
}