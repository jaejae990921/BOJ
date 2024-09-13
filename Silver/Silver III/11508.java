import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer[] dairy;
        int sum = 0, temp;

        int N = Integer.parseInt(br.readLine());
        dairy = new Integer[N + 3];

        for (int i = 0; i < N; i++) {
            dairy[i] = Integer.parseInt(br.readLine());
        }

        dairy[N] = 0;
        dairy[N + 1] = 0;
        dairy[N + 2] = 0;

        Arrays.sort(dairy, Collections.reverseOrder());

        for (int j = 0; j < N + 2; j += 3) {
            temp = 0;
            temp = dairy[j] + dairy[j + 1];

            sum += temp;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}