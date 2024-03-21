import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int min = sc.nextInt();
        
        // 45분보다 작으면 시간을 -1
        if(min<45) {
            hour--;
            min = 60-(45-min);
            
            // 0보다 작을시 23시로
            if(hour<0) {
                hour = 23;
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min - 45));
        }
    }
}