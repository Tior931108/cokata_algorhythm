import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        // 정수형으로 담을 컬렉션 리스트 선언
        List<Integer> ans = new ArrayList<Integer>();
        
        // arr 요소별로 div 나누기 했을때 0인 케이스
        // ans 리스트에 순차적으로 담기
        for(int i=0; i<arr.length; i++) {
             if(arr[i] % divisor == 0) {
                 ans.add(arr[i]);
             } 
        }
        
        // ans 리스트에 나누어 떨어지는 값이 있을 경우 = 리스트 값이 존재할 경우
        if(ans.size() != 0) {
            // 리스트 크기 만큼 배열 선언
            answer = new int[ans.size()];
            
            // 리스트 순회하여 차례대로 배열에 대입
            for (int i=0; i<ans.size(); i++) {
                answer[i] = ans.get(i);
            }
            // 오름차순 정렬
            Arrays.sort(answer);
        }
        // arr 요소별로 div 나누기 했을때 0이 아닌 케이스
        // 이럴경우 ans 배열에 -1
        return answer;
    }
}