import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        StringTokenizer st;
        String op, x, w, key;

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            op = st.nextToken();

            switch (op) {
                case "1":
                    x = st.nextToken();
                    w = st.nextToken();
                    map.put(w, x);
                    break;
                case "2":
                    key = st.nextToken();
                    sb.append(map.get(key)).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}