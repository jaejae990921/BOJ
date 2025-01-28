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
        HashMap<String, String> map = new HashMap<>();
        String S, a, temp;
        int T, cnt;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            T = Integer.parseInt(st.nextToken());
            S = st.nextToken();
            a = "";

            for (int j = 0; j < 3; j++) {
                a += st.nextToken();
            }

            map.put(S, a);
        }

        for (int k = 0; k < M; k++) {
            temp = "";
            cnt = 0;

            st = new StringTokenizer(br.readLine());

            for (int l = 0; l < 3; l++) {
                temp += st.nextToken();
            }

            for (String key : map.keySet()) {
                if (map.get(key).equals(temp)) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                sb.append("!").append("\n");
            } else if (cnt == 1) {
                for (String key : map.keySet()) {
                    if (map.get(key).equals(temp)) {
                        sb.append(key).append("\n");
                    }
                }
            } else {
                sb.append("?").append("\n");
            }
        }

        System.out.println(sb);
    }
}