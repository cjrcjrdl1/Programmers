import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int[] False = {-1};
        for(int i =0;i<arr.length;i++){
            if(arr[i] % divisor ==0){
                count++;
            }
        }
        return (count > 0) ? Arrays.stream(arr)
            .filter(i->i%divisor==0)
            .sorted()
            .toArray() : False;
    }
}