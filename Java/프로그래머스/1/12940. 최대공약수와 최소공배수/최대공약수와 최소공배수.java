class Solution {
    // 최대공약수 구하는 법(유클리드 호제법)
    // 두 양의 정수 a.b에 대하여 a = bq + r이라 하면
    // a,b 의 최대 공약수는 b, r의 최대공약수와 같다.
    int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 두 수에서 더 큰 수를 n으로 지정
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        // 최대 공약수 구하기
        answer[0] = gcd(n,m);
        
        // 최소 공배수 구하기
        // 두수의 곱 / 최대 공약수 = 최소 공배수
        answer[1] = n * m / answer[0];
        return answer;
    }
}