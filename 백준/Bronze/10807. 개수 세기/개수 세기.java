import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄
        int n = sc.nextInt();
        
        // 두 번째 줄
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        // 세 번째 줄
        int v = sc.nextInt();
        
        // num 배열 순회하면서 v와 같은 값의 개수 세기
        int cnt = 0;  
        for (int i = 0; i < n; i++) {
            if (num[i] == v)
                cnt++;
        }
        
        System.out.println(cnt);
        
        sc.close();
    }
}