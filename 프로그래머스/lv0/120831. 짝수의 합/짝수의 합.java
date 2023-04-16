import java.util.stream.*;
class Solution {
    public int solution(int n) {
        // int answer =0;
        // for(int i=0;i<=n;i++){
        //     if(i%2==0) answer +=i; 
        // }
        return IntStream.rangeClosed(0,n).filter(a -> a%2==0).sum();
        // return answer;
    }
}