import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] a = new int[4];
        int[] b = new int[2];

        for (int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {
            b[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        sb.append(a[1] + a[2] + a[3] + b[1]);

        System.out.println(sb);
    }
}