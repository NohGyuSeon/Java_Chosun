import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
 
    public static int M = 0;    // �Ž�����
    public static int N = 0;    // ������
    public static int[] coin = null;     // �����׼� �迭
    public static int minCnt = Integer.MAX_VALUE;    // �Ž������� �ּ� ������
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();    // ���� ��
        M = scanner.nextInt();    // �Ž�����
        
        coin = new int[N];    // �����׼� �迭 �Ҵ�
        
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
        
        // ū �׼��� ������ ����ؼ� �Ž��������� ������ ��� �������� ���ϰ�
        // �������� �ٽ� ���� �׼��� ������ ������ ����� ������.
        // ���� ���� ������ �ּ� ������ �ȴ�.
        // �������� 0�� �Ǹ� ����
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