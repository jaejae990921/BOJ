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
        String keyword = "";

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = N;

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 0);
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine(), ",");

            while (st.hasMoreTokens()) {
                keyword = st.nextToken();

                if (map.containsKey(keyword)) {
                    map.remove(keyword);
                    cnt--;
                }
            }

            sb.append(cnt).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}