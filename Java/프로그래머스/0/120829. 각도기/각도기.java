class Solution {
    // 자바에서는 0 < angle < 90 처럼
    // 두 비교를 한번에 연결하는 문법을 허용하지 않음
    // 0 < angle을 먼저 계산해서 boolean 타입이 되고,
    // boolean을 다시 90과 비교할때 int형과 할려고함
    // 따라서 두 비교를 논리 연산자 (&&)로 연결해야함.
    public int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        } else {
            System.out.println("각도기 범위를 초과합니다.");
        }
        return answer;
    }
}