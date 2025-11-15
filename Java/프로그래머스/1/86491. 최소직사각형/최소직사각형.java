import java.util.*;

class Solution {
    
    
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_v=0;
        int max_h=0;
        
        // 명함을 회전시킬 수 있다는 조건이 들어있기 때문에 
        // 가로와 세로로 구분짓지 않고 두 길이 중 긴 길이와 짧은 길이로 구분    
        for(int i=0;i<sizes.length;i++){
            // 명함의 길이 중 긴 길이는 긴 길이끼리 비교
            int v=Math.max(sizes[i][0],sizes[i][1]);
            // 짧은 길이는 짧은 길이끼리 비교
            int h=Math.min(sizes[i][0],sizes[i][1]);
            // 두 개의 그룹에서 각각 최대값 산출
            max_v=Math.max(max_v,v);
            max_h=Math.max(max_h,h);
        }
        // 최종 지갑의 크기 계산
        return answer=max_v*max_h;
    }
}
