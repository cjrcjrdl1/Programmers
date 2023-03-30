class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len%2==0){
            len = len/2-1;
            answer = s.substring(len,len+2);
        }else{
            len = len/2;
            answer = s.substring(len,len+1);
        }
        
        return answer;
    }
}