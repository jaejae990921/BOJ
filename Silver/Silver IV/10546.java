import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        String name = "";

        int N = Integer.parseInt(br.readLine()) * 2 - 1;

        for (int i = 0; i < N; i++) {
            name = br.readLine();

            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, 1);
            }
        }

        for (String key : map.keySet()) {
            sb.append(key);
        }

        System.out.println(sb);
    }
}