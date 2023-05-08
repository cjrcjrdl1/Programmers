class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char x : myString.toCharArray()){
            answer += Character.toLowerCase(x);
        }
        return answer;
    }
}