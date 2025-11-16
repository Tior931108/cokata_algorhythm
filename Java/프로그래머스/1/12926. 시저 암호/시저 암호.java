class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
              char ch = s.charAt(i);
              
              if(Character.isLowerCase(ch)) { //소문자
                  // 제한조건 중 n의 길이가 25이하여서 상관없지만 
                  // 만약 25가 넘는다면 %26 나머지연산을 해주는 것
                  ch = (char) ((ch - 'a' + n) % 26 + 'a');
              } else if(Character.isUpperCase(ch)) { //대문자
                  ch = (char) ((ch - 'A' + n) % 26 + 'A');
              }
              
              answer += ch;
          }
    
        return answer;
    }
}