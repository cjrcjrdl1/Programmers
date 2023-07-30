import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        // return answer;
        return Arrays.stream(my_string.split(""))
            .filter(i->!i.equals(letter))
            .collect(Collectors.joining());
    }
}