import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Arrays.stream(sides).max().orElse(0);
        
        return Arrays.stream(sides).sum() - max > max ? 1 : 2;
    }
}