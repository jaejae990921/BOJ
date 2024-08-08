import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int set = 1000, one = 1000, min = Integer.MAX_VALUE;
        int setPrice, onePrice, mixPrice;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            set = Math.min(set, Integer.parseInt(st.nextToken()));
            one = Math.min(one, Integer.parseInt(st.nextToken()));
        }

        if (N % 6 == 0) {
            setPrice = set * (N / 6);
        } else {
            setPrice = set * (N / 6 + 1);
        }

        onePrice = one * N;
        mixPrice = (set * (N / 6)) + (one * (N % 6));

        min = Math.min(setPrice, Math.min(onePrice, mixPrice));

        sb.append(min);
        System.out.println(sb);
    }
}