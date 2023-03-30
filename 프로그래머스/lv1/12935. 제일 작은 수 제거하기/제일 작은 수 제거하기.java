class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length==1){
            return new int[]{-1};
        }
        
        int min = arr[0];
        for(int x : arr){
            if(x< min){
                min = x;
            }
        }
        
        int index = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == min){
                continue;
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}