import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        for(;i<completion.length;i++){
            if(!participant[i].equals(completion[i]))
                break;
        }
        return participant[i];
    }
}