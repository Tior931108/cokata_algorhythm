class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        
        if(length % 2 == 0) {
            // length가 짝수일 경우 length의 1/2값의 1을 뺀 위치부터 +2한 위치까지 문자열 s를 잘랐다.
            answer = s.substring(length/2-1, length/2+1);
        } else {
            // length가 홀수일 경우에는 length의 1/2값부터 +1한 값까지 substring으로 문자열 s를 잘랐다.
            answer = s.substring(length/2, length/2+1);
        }
        
        return answer;
    }
}