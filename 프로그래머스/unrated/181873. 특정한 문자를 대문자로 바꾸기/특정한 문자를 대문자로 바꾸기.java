class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char a = alp.charAt(0);
        for(char x : my_string.toCharArray()){
            if(x==a){
                answer += Character.toUpperCase(x);
            }else{
                answer += x;
            }
        }
        return answer;
    }
}