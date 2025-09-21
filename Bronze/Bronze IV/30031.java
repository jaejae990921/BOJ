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
        int width = 0, sum = 0;

        map.put(136, 1000);
        map.put(142, 5000);
        map.put(148, 10000);
        map.put(154, 50000);

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            width = Integer.parseInt(st.nextToken());

            sum += map.get(width);
        }

        sb.append(sum);
        System.out.println(sb);
    }
}