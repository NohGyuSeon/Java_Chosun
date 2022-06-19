import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
 
    public static int M = 0;    // 거스름돈
    public static int N = 0;    // 동전수
    public static int[] coin = null;     // 동전액수 배열
    public static int minCnt = Integer.MAX_VALUE;    // 거스름돈의 최소 동전수
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();    // 동전 수
        M = scanner.nextInt();    // 거스름돈
        
        coin = new int[N];    // 동전액수 배열 할당
        
        for (int i = 0; i < N; i++) {
            coin[i] = scanner.nextInt();
        }

        f1();
        
        System.out.println(minCnt);
        scanner.close();
    }
   
    private static void f1() {
        int cnt = 0;
        int money = M;
        
        // 큰 액수의 동전을 사용해서 거스름돈에서 나누어 몫과 나머지를 구하고
        // 나머지를 다시 다음 액수의 동전을 가지고 계산해 나간다.
        // 몫의 합이 동전의 최소 갯수가 된다.
        // 나머지가 0이 되면 종료
        for (int i = N-1; i >= 0; i--) {
            int mok = money / coin[i];
            int namozi = money % coin[i];
            
            cnt += mok;
            money = namozi;

            if(money == 0) {
                break;
            }
        }

        minCnt = cnt;
    }
}