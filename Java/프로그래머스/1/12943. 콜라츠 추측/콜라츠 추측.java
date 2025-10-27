class Solution {
    public int solution(int num) {
        int answer = 0;
        // int를 long으로 형변환
        long n = num;
        
        // 결과가 1이 아닐때 까지 반복
        while(n != 1) {
            if(n % 2 == 0) 
                n /= 2;
            else
                n = (n * 3 + 1);
            answer++;
            
            // 테스트 수 626331 계산시 21억이 초과
            // long 형변환 필요
            if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}