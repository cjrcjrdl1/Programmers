class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int index = phone_number.length()-4;
        for(int i =0;i<index;i++){
            answer += "*";
        }
        for(int i = index;i<phone_number.length();i++){
            answer += phone_number.charAt(i);
        }
        return answer;
    }
}