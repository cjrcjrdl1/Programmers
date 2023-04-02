class Solution {
    int[] numbers;
    int target;
    int answer;
    
    public void dfs(int index, int sum){
        if(index==numbers.length){
            if(sum==target) answer++;
            return;
        }
        
        dfs(index+1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        
        dfs(0,0);
        return answer;
    }
}