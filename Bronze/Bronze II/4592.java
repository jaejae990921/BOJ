import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list;
        StringTokenizer st;
        String input = "";
        int N = 0, prev = 0, cur = 0;

        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            N = Integer.parseInt(st.nextToken());

            if (N == 0) {
                break;
            }

            list = new ArrayList<>();

            prev = Integer.parseInt(st.nextToken());
            list.add(prev);

            for (int i = 1; i < N; i++) {
                cur = Integer.parseInt(st.nextToken());
                if (cur != prev) {
                    list.add(cur);
                    prev = cur;
                }
            }

            for (int num : list) {
                sb.append(num).append(" ");
            }

            sb.append("$\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}