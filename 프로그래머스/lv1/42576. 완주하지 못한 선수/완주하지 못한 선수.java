import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
//         String answer = "";
//         Arrays.sort(participant);
//         Arrays.sort(completion);
        
//         int i = 0;
//         for(;i<completion.length;i++){
//             if(!participant[i].equals(completion[i]))
//                 break;
//         }
//         return participant[i];
        String answer = "";
        HashMap<String,Integer> map  = new HashMap<>();
        for(String player : participant){
            map.put(player, map.getOrDefault(player,0)+1);
        }
        
        for(String player : completion){
            map.put(player, map.get(player)-1);
        }
        
        // for(String key : map.keySet()){
        //     if(map.get(key)!=0){
        //         answer = key;
        //         break;
        //     }
        // }
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Integer> entry = iter.next();
            if(entry.getValue()!=0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}