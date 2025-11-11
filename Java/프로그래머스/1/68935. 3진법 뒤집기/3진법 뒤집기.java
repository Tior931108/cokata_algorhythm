class Solution {
    public int solution(int n) {
        String str = "";
        
        // 3진법 계산 하는 방법
        // 나머지를 먼저 문자열에 더해버리기 때문에,
        // 자연스럽게 3진법이 뒤집힌 형태로 저장
         while (n != 0) {
            str += n % 3;
            n /= 3;
        }
        
        // Integer.parseInt(String s, int radix)
        // s : 변환할 문자열
        // radix : 진법 (2 ~ 36)
        // 반환값: int (십진수 정수)
        // str 문자열을 3진수로 해석하여 10진수로 변환한다.
        return Integer.parseInt(str, 3);
    }
}