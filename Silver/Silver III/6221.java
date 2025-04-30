import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static class Bale implements Comparable<Bale> {
        int width, breadth;

        public Bale(int width, int breadth) {
            this.width = width;
            this.breadth = breadth;
        }

        @Override
        public int compareTo(Bale o) {
            if (this.width == o.width) {
                return o.breadth - this.breadth;
            }
            return this.width - o.width;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int width, breadth;

        int N = Integer.parseInt(br.readLine());
        Bale[] bales = new Bale[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            breadth = Integer.parseInt(st.nextToken());

            bales[i] = new Bale(width, breadth);
        }

        Arrays.sort(bales);

        int[] dp = new int[N];
        Arrays.fill(dp, 1);
        int max = 1;

        for (int j = 1; j < N; j++) {
            for (int k = 0; k < j; k++) {
                if (bales[k].width < bales[j].width && bales[k].breadth < bales[j].breadth) {
                    dp[j] = Math.max(dp[j], dp[k] + 1);
                }
            }
            max = Math.max(max, dp[j]);
        }

        sb.append(max);
        System.out.println(sb);
    }
}