class Solution {
    public int solution(int n) {
        int answer = 0;
        long num = n;
        while(num!=1){

            if(num%2==0){
                num = num/2;
            }else{
                num = num*3+1;
            }
            answer++;
            if(answer>500){
                return -1;
            }
        }
        
        return answer;
    }
}