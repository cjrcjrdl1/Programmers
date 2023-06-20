class Solution {
    public int[] solution(int[] num_list, int n) {
        int index = 0;
        for(int i = 0;i<num_list.length;i+=n){
            index++;
        }
        System.out.println(index);
        int[] answer = new int[index];
        int real=0;
        for(int i = 0;i<num_list.length;i+=n){
            answer[real++] = num_list[i];
        }
        
        return answer;
    }
}