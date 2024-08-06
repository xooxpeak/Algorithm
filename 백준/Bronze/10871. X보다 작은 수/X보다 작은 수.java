import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄
        int N = sc.nextInt();
        int X = sc.nextInt();
            
        // 두 번째 줄
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // X보다 작은 수 출력
        for (int i = 0; i < N; i++) {
            if (A[i] < X) 
                System.out.print(A[i] + " ");
        }
        
        sc.close();
    }
}