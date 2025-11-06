class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        
        // 놀이기구 탄 횟수만큼 금액 늘리기
        for(int i=1; i<count+1; i++) {
            total += price*i;
        }
        
        // 가진 돈 보다 비용이 많이 들 경우
        if(money<total)
            answer = total - money;
        // 모자르지 않은 경우
        else
            answer = 0;

        return answer;
    }
}