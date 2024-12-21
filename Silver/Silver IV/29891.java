import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> minus = new ArrayList<>();
        ArrayList<Integer> plus = new ArrayList<>();
        long cnt = 0;
        int temp;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            temp = Integer.parseInt(br.readLine());

            if (temp < 0) {
                minus.add(temp);
            } else {
                plus.add(temp);
            }
        }

        Collections.sort(minus);
        Collections.sort(plus, Collections.reverseOrder());

        while (minus.size() > 0) {
            cnt += Math.abs(minus.get(0));

            if (minus.size() >= K) {
                for (int i = 0; i < K; i++) {
                    minus.remove(0);
                }
            } else {
                minus.clear();
            }
        }

        while (plus.size() > 0) {
            cnt += plus.get(0);

            if (plus.size() >= K) {
                for (int i = 0; i < K; i++) {
                    plus.remove(0);
                }
            } else {
                plus.clear();
            }
        }

        sb.append(cnt * 2);
        System.out.println(sb);
    }
}