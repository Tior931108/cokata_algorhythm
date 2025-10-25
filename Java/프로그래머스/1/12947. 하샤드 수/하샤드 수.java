class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        // 양의 정수 x를 String 배열로 하나하나 잘라서 넣는다.
        String[] num = Integer.toString(x).split("");
        
        // sum에 int로 하나씩 변환하면서 더하기
        for(int i=0; i< num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }
        
        // 만약 x를 sum으로 나눈 나머지가 0이면 true 아니면 false
        if(x % sum !=0) {
            answer = false;
        }
        return answer;
    }
}