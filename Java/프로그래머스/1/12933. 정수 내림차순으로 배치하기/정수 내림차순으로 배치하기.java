import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // long 숫자를 String 문자열 변환 하고 ""구분자 로 나누어서 배열로 삽입
        String[] str = Long.toString(n).split("");
        
        // import java.util.Arrays 필수!
        // Arrays.sort()
        // import java.util.Collections 필수!
        // Collections.reverseOrder() 내림차순 정렬
        Arrays.sort(str, Collections.reverseOrder());
        
        String ans = "";
        
        for(String s : str) {
            ans += s;
        }
        
        // 다시 문자열을 Long 숫자형으로 변환
        answer = Long.parseLong(ans);
        
        return answer;
    }
}