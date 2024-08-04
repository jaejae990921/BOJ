import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st;
        String name, type;
        int n, result;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            map.clear();

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());

                name = st.nextToken();
                type = st.nextToken();

                if (map.containsKey(type)) {
                    map.put(type, map.get(type) + 1);
                } else {
                    map.put(type, 1);
                }
            }

            result = 1;

            for (int value : map.values()) {
                result *= (value + 1);
            }

            sb.append(result - 1).append("\n");
        }

        System.out.println(sb);
    }
}