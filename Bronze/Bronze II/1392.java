import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int time;

        for (int i = 1; i <= N; i++) {
            time = Integer.parseInt(br.readLine());

            for (int j = 0; j < time; j++) {
                list.add(i);
            }
        }

        int n;

        for (int k = 0; k < Q; k++) {
            n = Integer.parseInt(br.readLine());

            sb.append(list.get(n)).append("\n");
        }

        System.out.println(sb);
    }
}