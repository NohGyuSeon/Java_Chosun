import java.util.*;

class Jobs 
{
    // ������ �� ���μ����� �̸�, �����ð�, ���񽺽ð� ���� �迭�� ������
    private String processNames[];
    private int    arrivalTimes[];
    private int    serviceTimes[];
    private int    index; // ���� ���� ������ ���μ����� �� �迭 �ε���

    public void printJobs() {
        for (String n: processNames)
            System.out.printf("%2s ", n); 
        System.out.println();
        for (int t: arrivalTimes)
            System.out.printf("%2d ", t); 
        System.out.println();
        for (int s: serviceTimes)
            System.out.printf("%2d ", s); 
        System.out.println();
    }
    
    public Jobs(Scanner s) {  // ������
        // ������ �� ���μ����� ������ �Է� ����
        System.out.print("The number of processes? ");
        int num = s.nextInt();

        int processNames [] = new int [num];
        System.out.println("input ? process names : ");
        
        // num���� ���Ҹ� ������ ���ڿ� processNames[] �迭�� ����
        // ������ �Է¿� �޽����� ����ϰ�("input ? process names : ")
        // for ���� �̿��Ͽ� num��  ���μ������� �̸��� �Է� �޾� processNames[] �迭�� ���� 

        // num���� ���Ҹ� ������ ������ arrivalTimes[] �迭�� ����
        // ������ �Է¿� �޽����� ����ϰ�
        // for ���� �̿��Ͽ� num��  ���μ������� �����ð��� �Է� �޾� arrivalTimes[] �迭�� ���� 

        // num���� ���Ҹ� ������ ������ serviceTimes[] �迭�� ����
        // ������ �Է¿� �޽����� ����ϰ�
        // for ���� �̿��Ͽ� num��  ���μ������� ���񽺽ð��� �Է� �޾� serviceTimes[] �迭�� ���� 

        System.out.println();
        printJobs();
    }
    
    // ó������ �ٽ� �����ٸ��� �����ϰ��� �ϴ� ��� ȣ��
    public void    reset()          { index = 0; } 
        
    // ���� �������� ���� ���μ����� �� �ִ��� ����
    public boolean hasNextProcess() { return index < arrivalTimes.length; } 

}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Jobs jobs = null;

        while (true) {
            System.out.println("************************ Main Menu *******************");
            System.out.println("* 0.Exit  1.Jobs 2.Process                           *");
            System.out.println("* 3.FCFS  4.SPN  5.HRRN  6.SRT  7.RR(q=1)  8.RR(q=4) *");
            System.out.println("******************************************************");
            System.out.print("Menu item number? ");

            int idx = scan.nextInt();
            if (idx == 0) 
                break;

            switch (idx) {
            case 1: jobs = new Jobs(scan); 
                    break;
            default: System.out.println("WRONG menu item\n");
                    break;
            }
            System.out.println();
        }
        System.out.println("Good bye.");
        scan.close();
    }
}