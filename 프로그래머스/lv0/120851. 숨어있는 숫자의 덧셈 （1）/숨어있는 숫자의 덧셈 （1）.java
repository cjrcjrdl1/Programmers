import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char x : my_string.toCharArray()){
            if(Character.isDigit(x)) answer+=Character.getNumericValue(x);
        }
        return answer;
        // return Arrays.stream(my_string.split(""))
        //     .filter(i->i.matches("[0-9]"))
        //     .mapToInt(Integer::parseInt)
        //     .sum();
    }
}