import java.util.stream.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = 1000000;
        for(int i = 1;i<=n;i++){
            if(n%i==1 && i<min){
                min = i;
            }
        }
        return min;
        // return IntStream.range(2,n).filter(i->n%i==1).findFirst().orElse(0);
    }
}