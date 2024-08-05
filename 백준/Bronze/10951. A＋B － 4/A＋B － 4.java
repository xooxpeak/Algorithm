import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()) {  // 다음 입력이 있는 동안 반복
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(a + b);
        }
        
        sc.close();
    }
}