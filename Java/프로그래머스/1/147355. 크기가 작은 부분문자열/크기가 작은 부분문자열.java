class Solution {
    public int solution(String t, String p) {
        int length = t.length() - p.length() + 1;
        // 문자열의 길이가 10000까지 존재할 수 있으므로 long 타입
        long pNum = Long.parseLong(p);
        int answer = 0;
        // 반복문의 인덱스를 넘지 않으면서 문자열을 자르기 위해
        // 문자열 t의 길이에서 문자열 p의 길이만큼 뺀 숫자만큼 반복
        for (int i = 0; i < length; i++) {
            //substring을 통해 t를 i부터 i + p.length()만큼 문자열을 잘라 temp에 담는다.
            String temp = t.substring(i, i + p.length()); 
            // 부분문자열 temp의 값이 p보다 작은 경우 answer를 증가
            if (Long.parseLong(temp) <= pNum) {
            	answer++;
            }
        }
        return answer;
    }
}