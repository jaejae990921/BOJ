import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int sum = 0;
        int num;
        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            sum += num*num;
        }
        System.out.println(sum%10);
    }
}