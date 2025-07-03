import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st;
        String a = "";
        int s, t;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            s = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                a = st.nextToken();

                if (map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);
                } else {
                    map.put(a, 1);
                }
            }
        }

        if (map.size() == 1) {
            sb.append(map.keySet().iterator().next());
        } else {
            List<String> keySet = new ArrayList<>(map.keySet());
            keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

            if (keySet.size() == 1 || map.get(keySet.get(0)) > map.get(keySet.get(1))) {
                sb.append(keySet.get(0));
            } else {
                sb.append("-1");
            }

        }

        System.out.println(sb);
    }
}