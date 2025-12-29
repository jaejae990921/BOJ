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
        int A = 0, B = 0, C = 0, sum = 0;

        ArrayList<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            sum = A + B + C;

            if (sum >= 512) {
                list.add(sum);
            }
        }

        if (list.size() == 0) {
            sb.append(-1);
        } else {
            Collections.sort(list);
            sb.append(list.get(0));
        }

        System.out.println(sb);
    }
}