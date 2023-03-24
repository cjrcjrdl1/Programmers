import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        return (int)Arrays.stream(String.valueOf(order).split(""))
            .filter(i->i.equals("3") || i.equals("6") || i.equals("9"))
            .count();
    }
}