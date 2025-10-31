import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0, sum = 0, x1 = 0, x2 = 0, x3 = 0;
        boolean flag = false;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            flag = false;
            sum = 0;

            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            x3 = Integer.parseInt(st.nextToken());

            sum = x1 + x2 + x3;

            if (x1 >= L && x2 >= L && x3 >= L && sum >= K && sum >= K) {
                flag = true;
                cnt++;
            }

            if (flag) {
                list.add(x1);
                list.add(x2);
                list.add(x3);
            }
        }

        sb.append(cnt).append("\n");

        for (int kg : list) {
            sb.append(kg).append(" ");
        }

        System.out.println(sb);
    }
}