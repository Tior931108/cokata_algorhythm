import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 가로 길이가 a, 세로 길이가 b인 직사각형 형태의 * 출력
        for(int i=0; i<b; i++) {
            // a만큼 별을 찍어 준 후 줄을 바꾼다.
            for(int j=0; j<a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }         
    }
}