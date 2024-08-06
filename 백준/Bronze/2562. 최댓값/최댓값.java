import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;  // 최댓값
        int idx = 0;  // 인덱스
        
        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;  // 최댓값 업뎃
                idx = i;  // 그 인덱스
            }
        }
        
        System.out.println(max);
        System.out.println(idx);
        
        sc.close();
    }
}