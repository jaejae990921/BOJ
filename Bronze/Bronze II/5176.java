import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int P, M, chair, cnt = 0;

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            P = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            for (int j = 0; j < P; j++) {
                chair = Integer.parseInt(br.readLine());

                if (list.contains(chair)) {
                    cnt++;
                } else {
                    list.add(chair);
                }
            }

            sb.append(cnt).append("\n");
            list.clear();
            cnt = 0;
        }

        System.out.println(sb);
    }
}