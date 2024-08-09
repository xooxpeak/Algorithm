import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 바구니 개수
        int M = sc.nextInt();  // 작업 횟수
        
        int[] arr = new int[N];
        
        // 1번부터 N번까지
        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        // M번의 작업
        for(int m = 0; m < M; m++) {
            int i = sc.nextInt() - 1; // 사용자가 입력한 값-1을 해서 index 설정
            int j = sc.nextInt() - 1;
            
            // 역순으로 바꾸기
            while(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        for(int k = 0; k < N; k++) {
            System.out.print(arr[k] + " ");
        }
        
        sc.close();
    }
}