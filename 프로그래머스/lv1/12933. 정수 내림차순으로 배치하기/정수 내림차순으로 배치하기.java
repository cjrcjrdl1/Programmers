import java.util.*;
import java.util.stream.*;
class Solution {
    public long solution(long n) {
        String[] real = String.valueOf(n).split("");
        Arrays.sort(real);
        StringBuilder sb = new StringBuilder();
        for(String x : real){
            sb.append(x);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}