class Solution {
    public int[] solution(long n) {
        
        // 임의의 수 n을 문자열로 변환
        String arrStr = Long.toString(n);
        // 배열 answer에 문자열 길이만큼 초기화 선언
        int[] answer = new int[arrStr.length()];
        // 문자열 길이 만큼 반복 (뒤집어서 반복)
        // 배열[5]라면 4,3,2,1,0 까지반복
        for(int i=arrStr.length()-1; i>= 0; i--) {
            // charAt은 String타입으로 받은 문자열을 Char 타입으로 한글자씩 받는 메소드
            // 문자열을 int형으로 변환하면 아스키코드값으로 변환
            // 예를 들면 '1' 은 아스키코드로 49이다 
            // 따라서 원하는 자연수가 나오도록 문자열의 '0'(아스키코드:48)을 빼준다. 
            answer[arrStr.length()-1-i] = arrStr.charAt(i) - '0';
        }
        return answer;
    }
}