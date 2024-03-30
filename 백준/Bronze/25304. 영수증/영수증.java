import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();   // 총 금액
        int n = sc.nextInt();   // 구매한 물건 종류 개수
        
        int product[][] = new int[n][2];  // [0]: 상품가격 [1]: 상품개수
        
        // 총 금액이 맞는지 비교
        int comp = 0; 
        for(int i = 0; i < product.length; i++) {
            product[i][0] = sc.nextInt();  // 상품가격
            product[i][1] = sc.nextInt();  // 상품개수
            comp += product[i][0] * product[i][1];  // 총 금액 계산 = 각 물건의 가격과 개수를 곱한 값을 더한다.
        }
        
        // 입력받은 총 금액과 계산된 총 금액이 같은지 비교
        if(x == comp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}