import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<String, String>();
        String temp, answer = "";
        int cnt, idx = 0;

        map.put("A", "000000");
        map.put("B", "001111");
        map.put("C", "010011");
        map.put("D", "011100");
        map.put("E", "100110");
        map.put("F", "101001");
        map.put("G", "110101");
        map.put("H", "111010");

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            temp = "";

            for (int j = 0; j < 6; j++) {
                temp += str.charAt(i * 6 + j);
            }

            for (String key : map.keySet()) {
                if (map.get(key).equals(temp)) {
                    answer += key;
                    break;
                } else {
                    cnt = 0;

                    for (int k = 0; k < 6; k++) {
                        if (map.get(key).charAt(k) != temp.charAt(k)) {
                            cnt++;
                        }
                    }

                    if (cnt == 1) {
                        answer += key;
                        break;
                    }
                }
            }

            if (answer.length() != i + 1) {
                idx = i + 1;
                break;
            }
        }

        sb.append(idx == 0 ? answer : idx);
        System.out.println(sb);
    }
}