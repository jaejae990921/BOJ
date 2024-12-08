import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int candy, box, R, C, cnt;

        ArrayList<Integer> boxes = new ArrayList<>();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            candy = Integer.parseInt(st.nextToken());
            box = Integer.parseInt(st.nextToken());

            for (int j = 0; j < box; j++) {
                st = new StringTokenizer(br.readLine());

                R = Integer.parseInt(st.nextToken());
                C = Integer.parseInt(st.nextToken());

                boxes.add(R * C);
            }

            Collections.sort(boxes);

            cnt = 0;

            for (int j = boxes.size() - 1; j >= 0; j--) {
                if (candy <= 0) {
                    break;
                }

                candy -= boxes.get(j);
                cnt++;
            }

            sb.append(cnt).append("\n");
            boxes.clear();
        }

        System.out.println(sb);
    }
}