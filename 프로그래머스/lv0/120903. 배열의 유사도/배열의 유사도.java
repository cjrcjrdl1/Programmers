import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int)Arrays.stream(s1).map(i-> Arrays.stream(s2).collect(Collectors.toList()).contains(i)).filter(i->i).count();
    }
}