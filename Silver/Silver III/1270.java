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
        List<String> keySet;
        StringTokenizer st;
        String soldier = "";
        int Ti = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Ti = Integer.parseInt(st.nextToken());

            for (int j = 0; j < Ti; j++) {
                soldier = st.nextToken();

                if (map.containsKey(soldier)) {
                    map.put(soldier, map.get(soldier) + 1);
                } else {
                    map.put(soldier, 1);
                }
            }

            keySet = new ArrayList<>(map.keySet());
            keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

            if (map.get(keySet.get(0)) > (Ti / 2)) {
                sb.append(keySet.get(0));
            } else {
                sb.append("SYJKGW");
            }

            sb.append("\n");
            map.clear();
        }

        System.out.println(sb);
    }
}