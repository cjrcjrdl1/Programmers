class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int i = 0;
        for(int x : arr){
            if (x >=50 && x%2==0){
                answer[i++] = x/2;
            }else if(x<50 && x%2==1){
                answer[i++] = x*2;
            }else{
                answer[i++] = x;
            }
        }
        return answer;
    }
}