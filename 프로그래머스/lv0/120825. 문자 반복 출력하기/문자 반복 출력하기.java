class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(char a : my_string.toCharArray()){
            for(int i =0;i<n;i++){
                answer += a;
            }
        }
        return answer;
    }
}