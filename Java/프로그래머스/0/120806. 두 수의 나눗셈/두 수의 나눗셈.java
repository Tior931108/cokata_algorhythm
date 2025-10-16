class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        // num1과 num2는 int형이기때문에 java에서는 정수 나눗셈 -> 소수점 이하가 잘려나감
        // 따라서, num1 또는 num2를 double형으로 강제 형 변환해야함
        // 그러면 double형 / int형 계산은 묵시적 형변환으로 double형 끼리의 나눗셈계산이 됌.
        double result = (double) num1 / num2 * 1000;
        answer = (int)result;
        return answer;
    }
}