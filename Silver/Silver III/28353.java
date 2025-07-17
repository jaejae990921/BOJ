import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] cats = new int[N];
        int start = 0;
        int end = N - 1;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            cats[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cats);

        while (start < end) {
            if (cats[start] + cats[end] <= K) {
                cnt++;
                start++;
                end--;
            } else {
                end--;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}