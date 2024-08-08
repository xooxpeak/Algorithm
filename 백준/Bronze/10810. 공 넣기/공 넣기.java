import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 바구니 수
        int M = sc.nextInt();  // 공을 넣는 횟수
        
        int[] baskets = new int[N];  // 바구니는 처음에 비어져있음
        
        // M번 공 넣기
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();  // 시작 바구니 번호
            int j = sc.nextInt();  // 끝 바구니 번호
            int k = sc.nextInt();  // 공의 번호
            
            // i번 바구니부터 j번 바구니까지 k번 공 넣음
            for (int b = i - 1; b < j; b++) {
                baskets[b] = k;
            }
        }
        
        for (int n = 0; n < N; n++) {
            System.out.print(baskets[n] + " ");
        }
    }
}