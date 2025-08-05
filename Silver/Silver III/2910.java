import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static public class NumberInfo {
        int cnt;
        int firstIndex;

        public NumberInfo(int cnt, int firstIndex) {
            this.cnt = cnt;
            this.firstIndex = firstIndex;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, NumberInfo> map = new HashMap<>();
        StringTokenizer st;
        NumberInfo numberInfo;
        int value, cnt;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            value = Integer.parseInt(st.nextToken());

            if (map.containsKey(value)) {
                numberInfo = map.get(value);
                numberInfo.cnt++;
            } else {
                numberInfo = new NumberInfo(1, i);
                map.put(value, numberInfo);
            }
        }

        List<Map.Entry<Integer, NumberInfo>> entries = new ArrayList<>(map.entrySet());

        entries.sort((e1, e2) -> {
            if (e2.getValue().cnt != e1.getValue().cnt) {
                return e2.getValue().cnt - e1.getValue().cnt;
            } else {
                return e1.getValue().firstIndex - e2.getValue().firstIndex;
            }
        });

        for (Map.Entry<Integer, NumberInfo> entry : entries) {
            value = entry.getKey();
            cnt = entry.getValue().cnt;

            for (int i = 0; i < cnt; i++) {
                sb.append(value).append(" ");
            }
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}