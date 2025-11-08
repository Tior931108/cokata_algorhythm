class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // answer 배열 동일한 크기 2차원 배열 선언
        int[][] answer = new int[arr1.length][arr1[0].length];
        // 2차원 배열 순회
        for(int i = 0; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++) {
                // 같은 위치의 값 합하고 answer 2차원 배열에 넣기
                answer[i][j] = arr1[i][j] + arr2[i][j]; 
            }
        }
        return answer;
    }
}