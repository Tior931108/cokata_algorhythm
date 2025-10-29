class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        // signs 배열만큼 반복문
        for(int i=0; i<signs.length; i++) {
            // signs 배열 요소가 true : + 이라면, answer 배열에 + abs 배열요소 합산
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer += (absolutes[i] * -1);
            }
        }
        return answer;
    }
}