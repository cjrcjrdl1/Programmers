class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] <10 && 0<numbers[i]){
                answer += numbers[i];
            }
        }
        return 45-answer;
    }
}