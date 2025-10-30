class Solution {
    public String solution(String phone_number) {
        String answer = "";
        // String을 String[]로 변경하여 구분자로 나누기
        String[] num = phone_number.split("");
        
        // 전화번호 길이 만큼 순회
        for(int i=0; i < num.length; i++) {
            // 끝 4자리를 제외한 모든 숫자 *로 저장
            if(i<num.length - 4) {
                answer += "*";
            } else {
                answer += num[i];
            }
        }
        return answer;
    }
}