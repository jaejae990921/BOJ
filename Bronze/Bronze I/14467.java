import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int number, lr;

        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            number = Integer.parseInt(st.nextToken());
            lr = Integer.parseInt(st.nextToken());

            if (map.containsKey(number)) {
                if (map.get(number) != lr) {
                    cnt++;
                    map.put(number, lr);
                }
            } else {
                map.put(number, lr);
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}