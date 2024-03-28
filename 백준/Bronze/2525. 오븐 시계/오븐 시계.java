import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();  // 시
        int m = sc.nextInt();  // 분
        int hour = sc.nextInt();  // 요리하는데 필요한 시간
        
        h += hour / 60;  // 요리시간이 60을 넘는다면 60으로 나눈 몫만큼 h에 더한다.
        m += hour % 60;  // 나머지 분을 m에 더한다.
        
        // m이 60 이상이면 h에 한시간을 더하고, m은 60을 뺀다.
        if(m >= 60) {
            h += 1;
            m -= 60;
        }
        
        // h가 24시 이상이면 24를 뺀다. (24시는 0시)
        if(h >= 24) {
            h -= 24;
        }
        
        System.out.println(h + " " + m);
        
    }
}