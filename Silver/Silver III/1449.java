import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] water = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            water[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(water);

        int count = 0;
        int start = 0;

        for (int i = 0; i < N; i++) {
            if (start < water[i]) {
                start = water[i] + L - 1;
                count++;
            }
        }

        sb.append(count);
        System.out.println(sb);
    }
}