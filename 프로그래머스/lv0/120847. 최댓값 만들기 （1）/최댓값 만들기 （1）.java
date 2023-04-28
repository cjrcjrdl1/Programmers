class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 1;i<numbers.length;i++){
            if(answer<numbers[i-1] * numbers[i]){
                answer = numbers[i-1] * numbers[i];
            }
        }
        return answer;
    }
}