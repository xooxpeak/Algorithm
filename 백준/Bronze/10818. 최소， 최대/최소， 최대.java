import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄
        int N = sc.nextInt();
        
        // 두 번째 줄
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        // 최솟값과 최댓값을 찾기 위한 초기화
        int min = nums[0];
        int max = nums[0];

        // 배열을 순회하면서 최솟값과 최댓값을 찾음
        for (int i = 1; i < N; i++) {
            if (nums[i] < min) 
                min = nums[i];
            if (nums[i] > max) 
                max = nums[i];
        }

        // 결과 출력
        System.out.println(min + " " + max);

        // Scanner 객체 닫기
        sc.close();
    }
}