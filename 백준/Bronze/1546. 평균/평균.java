import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 과목 개수
        double[] scores = new double[N];
        
        // 점수 입력 받기
        for(int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
        }
        
        // 최대값 찾기
        double max = scores[0];
        for(int i = 1; i < N; i++) {
            if(scores[i] > max)
                max = scores[i];  // i번째가 더 크다면 최대값 업데이트
        }
        
        // 점수 변환 & 총합 계산
        double sum = 0;
        for(int i = 0; i < N; i++) {
            scores[i] = (scores[i] / max * 100);  // 점수 변환
            sum += scores[i];  // 총합
        }
        
        // 평균
        double avg = sum / N;
        
        System.out.println(avg);
        
        sc.close();
    }
}