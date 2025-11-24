import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        String cryptogram = "", temp = "";
        int max = 0, cnt = 0;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            cryptogram = br.readLine().replace(" ", "");

            for (int j = 0; j < cryptogram.length(); j++) {
                temp = String.valueOf(cryptogram.charAt(j));
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }

            for (int freq : map.values()) {
                if (freq > max) {
                    max = freq;
                }
            }

            for (int freq : map.values()) {
                if (freq == max) {
                    cnt++;
                }
            }

            if (cnt > 1) {
                sb.append("?\n");
            } else {
                for (String key : map.keySet()) {
                    if (map.get(key) == max) {
                        sb.append(key).append("\n");
                        break;
                    }
                }
            }

            map.clear();
            max = 0;
            cnt = 0;
        }

        System.out.println(sb);
    }
}