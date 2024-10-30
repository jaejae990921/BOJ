import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st;
        boolean flag;
        String temp;
        int cnt = 0, N, M;

        while ((temp = br.readLine()) != null) {
            st = new StringTokenizer(temp);

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            cnt = 0;

            for (int i = N; i <= M; i++) {
                temp = String.valueOf(i);
                flag = true;

                for (int j = 0; j < temp.length(); j++) {
                    if (map.containsKey(temp.charAt(j) - '0')) {
                        flag = false;
                        break;
                    } else {
                        map.put(temp.charAt(j) - '0', 1);
                    }
                }

                if (flag) {
                    cnt++;
                }

                map.clear();
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}