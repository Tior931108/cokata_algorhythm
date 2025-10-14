class Solution {
    public int solution(int num1, int num2) {
        
        if((num1 < -50001 || num1 > 50001) && (num2 < -50001 || num2 > 50001)) {
            System.out.println("값의 범위를 초과합니다.");
        }
        
        int answer = num1 - num2;
        return answer;
        
    }
}