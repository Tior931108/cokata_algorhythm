class Solution {
    public int solution(int[] number) {
        // 삼총사 방법의 수
        int answer = 0;
        
        // 3명의 학생 숫자 체크 하기 위해 3중 for문 작성
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // 3명의 학생 숫자 합이 0 이면 가짓수 1 증가
                    if(number[i] + number[j] + number[k] == 0) {
                        answer += 1;
                    }            
                }
            }
        }

        return answer;
    }
}