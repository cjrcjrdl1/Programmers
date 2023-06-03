class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (char x:  control.toCharArray()){
            if(x=='w'){
                n+=1;
            }else if(x=='s'){
                n-=1;
            }else if(x=='d'){
                n+=10;
            }else if(x=='a'){
                n-=10;
            }
        }
        answer =n;
        return answer;
    }
}