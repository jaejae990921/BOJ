import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            int gcd = gcd(arr[0], arr[i]);
            sb.append(arr[0] / gcd).append('/').append(arr[i] / gcd).append('\n');
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        int temp;

        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}