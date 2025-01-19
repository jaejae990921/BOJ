import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tmp;

        BigInteger N = new BigInteger(br.readLine());
        BigInteger start = new BigInteger("1");
        BigInteger end = N;
        BigInteger mid;

        while (true) {
            mid = start.add(end).divide(new BigInteger("2"));

            tmp = mid.multiply(mid).compareTo(N);

            if (tmp == 0) {
                sb.append(mid);
                break;
            } else if (tmp == 1) {
                end = mid.subtract(new BigInteger("1"));
            } else {
                start = mid.add(new BigInteger("1"));
            }
        }

        System.out.println(sb);
    }
}