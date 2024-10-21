import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 1000; i < 10000; i++) {
            if (specialNumber(i, 10) == specialNumber(i, 12) && specialNumber(i, 10) == specialNumber(i, 16)) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int specialNumber(int n, int base) {
        int sum = n;

        while (n != 0) {
            sum += n % base;
            n /= base;
        }

        return sum;
    }
}