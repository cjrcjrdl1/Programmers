class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a = String.valueOf(num);
        int count = 1;
        for(char x : a.toCharArray()){
            
            if(Character.getNumericValue(x)==k){
                break;
            }else{
                count++;
            }
        }
        if(count>a.length()){
            count = -1;
        }
        
        return count;
    }
}