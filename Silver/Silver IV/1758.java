import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        int N = Integer.parseInt(br.readLine());
        Integer[] tip = new Integer[N];

        for (int i = 0; i < N; i++) {
            tip[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tip, Collections.reverseOrder());

        for (int j = 0; j < N; j++) {
            if (tip[j] - j > 0) {
                sum += tip[j] - j;
            } else {
                break;
            }
        }

        sb.append(sum);
        System.out.println(sb);
    }
}