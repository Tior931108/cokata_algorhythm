class Solution {
    public long solution(long n) {
        // 수학 메소드 
        // sqrt(x) : x의 제곱근을 구하고 싶은 수
        // pow(x, y) : x를 y만큼 제곱해준다.
        long answer = 0;
        double sqrt = Math.sqrt(n);
        // 정수일때만 계산
        if(sqrt % 1 == 0) {
            // double 형을 long으로 형변환
            answer = (long) Math.pow(sqrt + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}