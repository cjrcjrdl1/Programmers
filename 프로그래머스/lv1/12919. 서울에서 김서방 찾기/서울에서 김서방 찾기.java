class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for(String x : seoul){
            
            if(x.equals("Kim")){
                break;
            }
            index++;
        }
        answer = "김서방은 " + index + "에 있다";
        return answer;
    }
}