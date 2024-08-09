import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // 서로 다른 나머지를 저장할 Set
        // 중복을 제거해주는 Set 사용
        Set<Integer> set = new HashSet<>();
        
        // 10개의 숫자 입력받기
        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            set.add(num % 42);  // 42로 나눈 나머지를 Set에 추가
        }
        
        // 서로 다른 나머지의 개수
        System.out.println(set.size());
        
        sc.close();
    }
}