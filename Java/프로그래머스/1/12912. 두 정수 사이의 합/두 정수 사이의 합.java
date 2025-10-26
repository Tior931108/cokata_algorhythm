class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        // 만약 a < b 이면 a부터 b까지 1씩 늘려가면서 반복문
        // 만약 b < a 이면 b부터 a까지 1씩 늘려가면서 반복문
        // a==b 이면 a 리턴
        if (a < b) {
            for (long i = a ; i <=b; i ++) {
                answer += i;
            }
        } else if (b < a) {
            for (long i = b ; i <=a; i ++) {
                answer += i;
            }
        } else {
            return a;
        }
        return answer;
    }
}