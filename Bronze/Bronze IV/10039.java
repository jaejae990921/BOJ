import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i<5; i++) {
            int num = sc.nextInt();
            if(num < 40) {
                num = 40;
            }
            sum += num;
        }
        System.out.println(sum/5);
    }
}