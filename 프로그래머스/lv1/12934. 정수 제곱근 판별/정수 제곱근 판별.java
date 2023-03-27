class Solution {
    public long solution(long n) {
        long answer = 0;
        double real = Math.sqrt(n);
        if(n%real == 0) answer = (long)Math.pow(real+1,2);
        else answer = -1;
        
        return answer;
    }
}