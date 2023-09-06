class Solution {
    public int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }
    public int solution(int n) {
        int answer = 0;
        for(int i =1;i<=n;i++){
            if(DFS(i)<=n){
                answer = i;
            } else{
                break;
            }
        }
        return answer;
    }
}