import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자열 배열에 담기
        String[] str = s.split("");
        
        // 정렬 라이브러리 사용하여 내림차순 정리
        Arrays.sort(str, Collections.reverseOrder());
        
        // 문자열 출력
        for( String a : str)
            answer += a;
        
        return answer;
    }
}