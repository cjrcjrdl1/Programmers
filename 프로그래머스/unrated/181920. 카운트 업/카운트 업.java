class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int count = start;
        for(int i=0;i<end-start+1;i++){
            answer[i] = count++;
        }
        return answer;
    }
}