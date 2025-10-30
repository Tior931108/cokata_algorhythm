class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 정수형 배열 크기 10만큼 생성
        int[] ans = new int[10];
        
        // 1. 0~9까지 순회했을때, 숫자가 있으면 1 삽입
        for(int i=0; i< numbers.length; i++) {
            ans[numbers[i]] = 1;
        }
        
        // 2. 순회를 통해 ans의 각 요소들의 값을 확인 
        // 만약 요소의 값이 0이면 ans의 인덱스는 numbers에 없던 값이라서 ans 배열에 해당 인덱스를 더해준다.
        for(int i=0; i< ans.length; i++) {
            if(ans[i] == 0)
                answer += i;
        }
        
        return answer;
        
        // 0~9까지 모두 더한 값 45에서 numbers의 값들을 빼주는 방법
        // int sum = 45;
        // for (int i : numbers) {
        //     sum -= i;
        // }
        // return sum;
    }
}