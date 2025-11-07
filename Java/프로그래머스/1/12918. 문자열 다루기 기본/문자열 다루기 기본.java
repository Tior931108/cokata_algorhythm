class Solution {
    public boolean solution(String s) {
        
        // 문자열 길이가 4 또는 6
        if(s.length() == 4 || s.length() == 6) {
            try{
                // s가 전부 숫자인경우
                Integer sIsInt = Integer.parseInt(s);
                return true;
            } catch (Exception e) {
                // 일부라도 숫자가 아닌 문자인경우
                return false;
            }
            
        }
        
        return false;
    }
}