import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        String str, temp;
        boolean flag = true;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            str = br.readLine();
            map.clear();
            flag = true;

            for (int j = 0; j < str.length(); j++) {
                temp = str.substring(j, j + 1);

                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);

                    if (map.get(temp) == 3) {
                        if (j + 1 < str.length() && temp.equals(str.substring(j + 1, j + 2))) {
                            j++;
                            map.put(temp, 0);
                        } else {
                            flag = false;
                            break;
                        }
                    }
                } else {
                    map.put(temp, 1);
                }
            }

            sb.append(flag ? "OK\n" : "FAKE\n");
        }

        System.out.println(sb);
    }
}