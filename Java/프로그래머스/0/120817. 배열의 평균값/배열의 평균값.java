class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // number.length는 int지만, sum을 double로 변환하여계산
        answer = (double) sum / numbers.length;
        return answer;
    }
}