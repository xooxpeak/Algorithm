import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();  // 첫번째 주사위
        int B = sc.nextInt();  // 두번째 주사위
        int C = sc.nextInt();  // 세번째 주사위
        
        if(A == B && A == C) {  // 세 개가 다 같을 경우 10000 + (같은눈) x 1000
            System.out.println(10000 + A * 1000);
        } else if(A == B && A != C || A == C && A != B) {  // 두 개만 같을 경우 1000 + (같은눈) x 100
            System.out.println(1000 + A * 100);
        } else if(B == C && B != A) {  // 두 개만 같을 경우 1000 + (같은눈) x 100
            System.out.println(1000 + B * 100);
        } else {  // 모두 다른 경우 (그중 가장 큰눈) x 100
            int max = A;
            if (max < B) max = B;
            if (max < C) max = C;
            System.out.println(max * 100);
            
        }
    }
}