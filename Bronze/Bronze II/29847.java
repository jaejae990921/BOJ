import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        String str = "", temp = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine().replace(" ", "");

            for (int j = 0; j < str.length(); j++) {
                temp = str.substring(j, j + 1);

                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        for (String key : list) {
            sb.append(key).append(" ").append(map.get(key)).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}