import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long a = sc.nextLong();
        long b = sc.nextLong();
        
        System.out.println(res(a,b));
    }

    public static long res(long a, long b) {
        return (a + b)*(a - b);
    }
}