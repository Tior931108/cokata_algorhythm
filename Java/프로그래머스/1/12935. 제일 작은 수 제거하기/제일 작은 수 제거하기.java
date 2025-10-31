import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 길이가 1일 경우 answer에 -1 저장
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int min = arr[0];
        
        // arr 배열을 모두 비교 한다음, 제일 작은 수를 min에 저장
        // Math.min(3,2) : 두 수를 비교하여 더 작은 수 '2'를 출력하는 메소드
        for(int i =1;i < arr.length; i ++) {
            min = Math.min(min, arr[i]);
        }
        
        // 제일 작은 수를 제외한 모든 arr배열 값을 저장
        int[] answer = new int[arr.length - 1];
        int cnt = 0;
        
        // 제일 작은 수와 일치한다면 계속, 아니면 answer배열에 담기
        for (int i=0; i< arr.length; i++) {
            if(min == arr[i])
                continue;
                
            answer[cnt++] = arr[i];
        }
        return answer;
    }
}