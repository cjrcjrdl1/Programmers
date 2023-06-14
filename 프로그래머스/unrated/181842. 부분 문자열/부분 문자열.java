class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        answer = str2.contains(str1) ? 1 : 0;
        return answer;
    }
}