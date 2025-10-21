class Solution {
    public long[] solution(int x, int n) {
        // 숫자 n개를 지니는 리스트(배열)
        long[] answer = new long[n];
        long num = x;
        for(int i=0 ; i < answer.length; i++) {
            // 2
            // 4 = 2 + 2
            // 6 = 2 + 2 + 2...
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}