import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");

        for (int i = 0; i < c; i++) {
            long a = Long.parseLong(num[i]);
            long b = (long) Math.sqrt(a);

            if (b*b==a) {
                System.out.print("1 ");
            }
            else {
                System.out.print("0 ");
            }
        }
    }
}