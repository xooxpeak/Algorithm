import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[30];
        
        // 출석한 학생 번호는 1로 표시
        for(int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            arr[num-1] = 1;
        }
        
        // 1로 표시가 안된 곳 = 출석하지 않은 학생 번호 출력
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) 
                System.out.println(i+1);  // 학생 번호는 인덱스+1
        }
        
        sc.close();
        
    }
}