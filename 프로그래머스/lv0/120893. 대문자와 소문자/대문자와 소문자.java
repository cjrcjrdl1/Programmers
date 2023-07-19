class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char x : my_string.toCharArray()){
            if(Character.isUpperCase(x)){
                answer += Character.toLowerCase(x);
            }else{
                answer += Character.toUpperCase(x);
            }
        }
        return answer;
    }
}