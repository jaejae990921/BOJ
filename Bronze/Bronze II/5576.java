import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int w[] = new int[10];
        int k[] = new int[10];

        for (int i = 0; i < 10; i++) {
            w[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            k[i] = Integer.parseInt(br.readLine());
        }

        int wsum = fun(w);
        int ksum = fun(k);

        sb.append(wsum).append(" ").append(ksum);
        System.out.println(sb);
    }

    public static int fun(int[] arr) {
        Arrays.sort(arr);

        int sum = arr[7] + arr[8] + arr[9];

        return sum;
    }
}