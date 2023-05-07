import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] real = s.toCharArray();
        Arrays.sort(real);

        StringBuilder sb = new StringBuilder(new String(real));
        answer = sb.reverse().toString();
        return answer;
    }
}