import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        return Arrays.stream(my_string.split(""))
            .filter(i->i.matches("[^aeiou]"))
            .collect(Collectors.joining());
    }
}