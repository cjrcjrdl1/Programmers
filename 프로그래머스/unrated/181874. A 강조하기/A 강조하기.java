class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char x : myString.toCharArray()){
            answer += Character.toLowerCase(x);
        }
        
        String real = "";
        for(char x : answer.toCharArray()){
            if(x=='a'){
                real += 'A';
            }else{
                real += x;
            }
        }
        return real;
    }
}