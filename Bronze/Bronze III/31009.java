import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st;
        String D = "";
        int C = 0, cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            D = st.nextToken();
            C = Integer.parseInt(st.nextToken());

            map.put(D, C);
        }

        sb.append(map.get("jinju")).append("\n");

        for (String key : map.keySet()) {
            if (key.equals("jinju")) {
                continue;
            }
            if (map.get(key) > map.get("jinju")) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}