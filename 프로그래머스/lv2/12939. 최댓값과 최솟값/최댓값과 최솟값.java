import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        int[] list = new int[a.length];
        for(int i = 0;i<a.length;i++){
            list[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(list);
        answer = list[0] + " " + list[a.length-1];
        return answer;
    }
}