import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean flag = false;
        String fruit;
        int cnt;

        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            fruit = st.nextToken();
            cnt = Integer.parseInt(st.nextToken());

            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + cnt);
            } else {
                map.put(fruit, cnt);
            }
        }

        for (String key : map.keySet()) {
            if (flag) {
                break;
            }

            if (map.get(key) == 5) {
                flag = true;
            }
        }

        if (flag) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }

        System.out.println(sb);
    }
}