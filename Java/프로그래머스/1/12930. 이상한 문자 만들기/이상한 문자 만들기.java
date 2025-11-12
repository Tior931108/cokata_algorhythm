class Solution {
    public String solution(String s) {
        
        String answer = "";
        // 공백 처리 변수
        int cnt = 0;
        // 문자열 문자단위로 분리
        String[] arr = s.split("");
        
        for(String str : arr) {
            // 공백이 포함되어 있으면 0 , 아니면 +1 다음자리수
            cnt = str.contains(" ") ? 0 : cnt + 1;
            // 짝수 인덱스면 소문자 , 홀수 인덱스면 대문자
            answer += cnt%2 == 0 ?  str.toLowerCase() : str.toUpperCase(); 
        }
        
        return answer;
    }
}