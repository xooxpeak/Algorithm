import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];  // 바구니 배열
        
        // 바구니 번호와 배열에 들어있는 숫자가 같음
        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        // M번의 교환 작업
        for(int m = 0; m < M; m++) {
            // 바꿀 번호
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            // 바구니 i와 j에 있는 공 교환
            int num = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = num;
        }
        
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}