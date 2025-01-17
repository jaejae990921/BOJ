import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> ring = new HashMap<>();
        HashMap<String, Integer> ringCount = new HashMap<>();
        StringTokenizer st;
        String name, rName;
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            name = st.nextToken();
            rName = st.nextToken();

            if (rName.equals("-")) {
                continue;
            }

            if (ring.containsKey(name)) {
                ring.put(name, rName);
            } else {
                ring.put(name, rName);
            }

            if (ringCount.containsKey(rName)) {
                ringCount.put(rName, ringCount.get(rName) + 1);
            } else {
                ringCount.put(rName, 1);
            }
        }

        for (String rKey : ringCount.keySet()) {
            if (ringCount.get(rKey) == 2) {
                cnt++;
            }
        }

        sb.append(cnt).append("\n");

        for (String rKey : ringCount.keySet()) {
            if (ringCount.get(rKey) == 2) {
                for (String nameKey : ring.keySet()) {
                    if (ring.get(nameKey).equals(rKey)) {
                        sb.append(nameKey).append(" ");
                    }
                }

                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}