class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // left부터 right까지 반복
         for(int i=left; i<=right; i++) {
             // 약수의 갯수
             // 본인도 본인의 약수일 수 있는데
             // 반복문을 돌릴떄, 수/2보다 큰 약수는 존재할 수 없기 때문
             int cnt = 1;
             
             for(int j=1; j<=i/2; j++) {
                if(i % j == 0) cnt++;
             }
             
             // 약수의 개수가 짝수라면 합, 아니면 차
             if(cnt % 2 == 0) answer += i;
             else answer -= i;
         }
        return answer;
    }
}