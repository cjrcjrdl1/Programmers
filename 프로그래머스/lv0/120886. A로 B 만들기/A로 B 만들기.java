import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String aa = new String(a);
        String bb = new String(b);
        
        if(aa.equals(bb)){
            return 1;
        }else{
            return 0;
        }
    }
}