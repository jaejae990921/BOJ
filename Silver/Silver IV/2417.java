import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        sb.append(binarySearch(n));

        System.out.println(sb);
    }

    public static long binarySearch(long n) {
        long start = 0;
        long end = n;
        long res = 0;

        while (start <= end) {
            long mid = (start + end) / 2;

            if (n <= Math.pow(mid, 2)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}